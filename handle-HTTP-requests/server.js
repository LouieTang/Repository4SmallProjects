const express = require('express');
const cors = require('cors');
const app = express();
const port = 8080;

app.use(express.json());
app.use(express.urlencoded({extended: false}));
app.use(cors());

app.get('/api/items', (req, res) => {
  res.send(req.header('User-Agent'));
});

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});