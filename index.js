// index.js

const express = require('express');
const app = express();
const port = 8083;

app.use(express.urlencoded({ extended: true }));

app.get('/', (req, res) => {
  const resultHtml = req.query.result || '';
  res.send(`
    <!DOCTYPE html>
    <html>
    <head>
        <title>Multiplication Table</title>
        <style>
            body { font-family: Arial, sans-serif; padding: 20px; }
            input, button { padding: 10px; font-size: 16px; }
            ul { line-height: 1.6; }
        </style>
    </head>
    <body>
        <h2>Multiplication Table Generator</h2>
        <form method="POST" action="/generate">
            <input type="number" name="number" required placeholder="Enter a number" />
            <button type="submit">Generate</button>
        </form>
        <div id="result">${resultHtml}</div>
    </body>
    </html>
  `);
});

app.post('/generate', (req, res) => {
  const num = parseInt(req.body.number);
  if (isNaN(num)) {
    return res.redirect('/?result=Invalid+input');
  }

  let result = `<h3>Multiplication Table for ${num}</h3><ul>`;
  for (let i = 1; i <= 10; i++) {
    result += `<li>${num} × ${i} = ${num * i}</li>`;
  }
  result += '</ul>';

  res.redirect('/?result=' + encodeURIComponent(result));
});

app.listen(port, () => {
  console.log(`✅ Server running at http://localhost:${port}`);
});
