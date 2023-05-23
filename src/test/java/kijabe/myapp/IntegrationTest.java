package kijabe.myapp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kijabe.myapp.KijabealluminaeApp;
import kijabe.myapp.config.AsyncSyncConfiguration;
import kijabe.myapp.config.EmbeddedElasticsearch;
import kijabe.myapp.config.EmbeddedSQL;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { KijabealluminaeApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
