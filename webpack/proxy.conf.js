function setupProxy({ tls }) {
  const conf = [
    {
      context: ['/api', '/services', '/management', '/v3/api-docs', '/h2-console', '/auth', '/health'],
      target: `http${tls ? 's' : ''}://localhost:8000`,
      secure: false,
      changeOrigin: tls,
    },
    {
      context: ['/websocket'],
      target: 'ws://127.0.0.1:8000',
      ws: true,
    },
  ];
  return conf;
}

module.exports = setupProxy;
