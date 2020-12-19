package com.example.mad_assignment11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1_TreeNode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_treenode);

        Button nodeBtn = findViewById(R.id.NodeBtn);
        EditText nodeTxt = findViewById(R.id.NodeTextReader);
        TextView nodeTv = findViewById(R.id.NodeTextViewer);

        nodeBtn.setOnClickListener(view -> {

            if (nodeTxt.getText().toString().equals("")){
                nodeTv.setText("Enter a value");
            }
            //TreeNode node0=null, node1=null, node2 = null, node3=null, node4=null;
            TreeNode node0 = new TreeNode(0);
            TreeNode node2 = new TreeNode(2, node0);
            TreeNode node1 = new TreeNode(1, node0);
            TreeNode node3 = new TreeNode(3, node1);
            TreeNode node4 = new TreeNode(4, node1);
            node0 = new TreeNode(0, node1, node2);
            node1 = new TreeNode(1,node0, node3, node4);
            TreeNode[] array = {node0, node1, node2, node3, node4};

            int check = Integer.parseInt(nodeTxt.getText().toString().trim());

            String result = "";
            if (check <0 || check > 4){
                nodeTv.setText("No such data exist");
            }else {
                TreeNode one = array[check];
                result+="Object with data:  "+ one.getData()+ "\n";
                result+="Has a number:  "+ check+"\n";
                result+= "parent object is: "+one.parent+"\n";
                result+= "child object1 is: "+one.child1+"\n";
                result+= "child object2 is: "+one.child2;
                nodeTv.setText(result);
            }


        });
    }
}