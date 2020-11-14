package com.example.sqlitelab;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView idView;
    EditText productBox;
    EditText skuBox;
//    EditText color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idView = (TextView) findViewById(R.id.productID);
        productBox = (EditText) findViewById(R.id.productName);
        skuBox = (EditText) findViewById(R.id.productSku);
//        color=(EditText) findViewById(R.id.productColor);
    }



    public void newProduct (View view) {

        int sku = Integer.parseInt(skuBox.getText().toString());

//        Product product = new Product(productBox.getText().toString(), sku,color.getText().toString());
        Product product = new Product(productBox.getText().toString(), sku);

        // TODO: add to database
        MyDBHandler dbHandler=new MyDBHandler(this);
        dbHandler.addProduct(product);

        productBox.setText("");

        skuBox.setText("");
//        color.setText("");
    }


    public void lookupProduct (View view) {
        MyDBHandler dbHandler=new MyDBHandler(this);
        // TODO: get from Database
        Product product = dbHandler.findProduct(productBox.getText().toString());

        if (product != null) {
            idView.setText(String.valueOf(product.getID()));
            skuBox.setText(String.valueOf(product.getSku()));
//            color.setText(String.valueOf(product.get_color()));

        } else {
            idView.setText("No Match Found");
        }
    }


    public void removeProduct (View view) {
        MyDBHandler dbHandler=new MyDBHandler(this);

        // TODO: remove from database
        boolean result = dbHandler.deleteProduct(productBox.getText().toString());

        if (result) {
            idView.setText("Record Deleted");
            productBox.setText("");
            skuBox.setText("");
        }
        else
            idView.setText("No Match Found");
    }

}