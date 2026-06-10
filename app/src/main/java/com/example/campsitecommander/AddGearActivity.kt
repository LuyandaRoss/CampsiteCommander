package com.example.campsitecommander

class AddGearActivity {
    fun onCreate(savedInstanceState: Int) {
        val onCreate = super.toString(savedInstanceState)
        onCreate(R.layout.activity_addgear)

        val editItemName = findViewById<EditText>(R.id.editItemName)
        val editCategory = findViewById<EditText>(R.id.editCategory)
        val editQuantity = findViewById<EditText>(R.id.editQuantity)
        val editComments = findViewById<EditText>(R.id.editComments)
        val btnSaveGear = findViewById<Button>(R.id.btnSaveGear)
        val btnBackToMain = findViewById<Button>(R.id.btnBackToMain)

        btnSaveGear.setOnClickListener {
            val name = editItemName.text.toString().trim()
            val category = editCategory.text.toString().trim()
            val qtyStr = editQuantity.text.toString().trim()
            val comment = editComments.text.toString().trim()

            // Error handling for empty inputs
            if (name.isEmpty() || category.isEmpty() || qtyStr.isEmpty() || comment.isEmpty()) {
                Toast.makeText(this, "Please fill all fields!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val qty = qtyStr.toIntOrNull()
            if (qty == null || qty <= 0) {
                Toast.makeText(this, "Quantity must be a number > 0", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Add to parallel arrays
            itemNames = itemNames + name
            categories = categories + category
            quantities = quantities + qty
            comments = comments + comment

            Toast.makeText(this, "$name added to packing list!", Toast.LENGTH_SHORT).show()
            finish() // go back to main
        }

        btnBackToMain.setOnClickListener {
            finish()
        }
    }
}
