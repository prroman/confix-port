function addAttribute() {
    var table = document.getElementById("myTable");
    var rowCount = table.rows.length - 1; // subtract 1 to exclude header row
    var newRow = table.insertRow(-1);

    var nameCell = newRow.insertCell(0);
    var nameInput = document.createElement("input");
    nameInput.setAttribute("id", "attributes" + rowCount + ".name");
    nameInput.setAttribute("name", "attributes[" + rowCount + "].name");
    nameInput.setAttribute("value", "");
    nameCell.appendChild(nameInput);

    var typeCell = newRow.insertCell(1);
    var typeInput = document.createElement("input");
    typeInput.setAttribute("id", "attributes" + rowCount + ".type");
    typeInput.setAttribute("name", "attributes[" + rowCount + "].type");
    typeInput.setAttribute("value", "");
    typeCell.appendChild(typeInput);
}

function deleteLastRow() {
  var table = document.getElementById("myTable");
  var numRows = table.rows.length;
  if (numRows > 2) { // check if there are more than 2 rows (1 header row + 1 data row)
    table.deleteRow(numRows - 1);
  }
}