function generateTable() {
  const number = document.getElementById("number").value;
  const table = document.getElementById("table");

  if (!number) {
    table.innerHTML = "<p>Please enter a number!</p>";
    return;
  }

  let result = `<h3>Table of ${number}</h3>`;
  for (let i = 1; i <= 10; i++) {
    result += `<p>${number} x ${i} = ${number * i}</p>`;
  }

  table.innerHTML = result;
}
