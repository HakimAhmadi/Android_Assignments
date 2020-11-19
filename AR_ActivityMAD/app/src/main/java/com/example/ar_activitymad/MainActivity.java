package com.example.ar_activitymad;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.ar.core.Anchor;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.assets.RenderableSource;
import com.google.ar.sceneform.math.Vector3;
import com.google.ar.sceneform.rendering.Color;
import com.google.ar.sceneform.rendering.MaterialFactory;
import com.google.ar.sceneform.rendering.ShapeFactory;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.BaseArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

public class MainActivity extends AppCompatActivity {

    private ArFragment arFragment;
    private ModelRenderable modelRenderable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        setUpModel();
        setUpPlane();
    }

    private void setUpPlane() {

        arFragment.setOnTapArPlaneListener(new BaseArFragment.OnTapArPlaneListener() {

            @Override
            public void onTapPlane(HitResult hitResult, Plane plane, MotionEvent motionEvent) {
                Anchor anchor = hitResult.createAnchor();
                AnchorNode anchorNode = new AnchorNode(anchor);
                anchorNode.setParent(arFragment.getArSceneView().getScene());
                createModel(anchorNode);

            }
        });
    }
    private void createModel(AnchorNode anchorNode){

        TransformableNode node = new TransformableNode(arFragment.getTransformationSystem());
        node.setParent(anchorNode);
        node.setRenderable(modelRenderable);
        node.select();
    }

//    void setUpModel() {
////        String Model_URL = "https://poly.googleusercontent.com/downloads/c/fp/1602706502330678/dh3af8qUMl1/aGyreF54YQ_/eren-hiphop-dance.glb";
//        String Model_URL = "https://poly.googleusercontent.com/downloads/c/fp/1604201113287796/fmBD1cHvck_/1LAq3AOleiZ/Ivysaur_HighQuality.glb";
////        String Model_URL = "https://poly.googleusercontent.com/downloads/c/fp/1603747739199508/fSrXojdzzmH/0wGRm5P7S81/25.%20Pikachu.glb";
//
//
//        ModelRenderable.builder()
//                .setSource(this, RenderableSource.builder().setSource(this, Uri.parse(Model_URL),
//                                RenderableSource.SourceType.GLB) // Here, we decided to use GLB file
//                                .setScale(0.01f) // Here, we scale 3D model
//                                .setRecenterMode(RenderableSource.RecenterMode.ROOT)
//                                .build()
//                )
//                .setRegistryId(Model_URL)
//                .build()
//                .thenAccept(renderable -> modelRenderable = renderable)
//                .exceptionally(throwable -> { // Here, we display an error if any
//                    Log.i("Model","cant load");
//                    Toast.makeText(MainActivity.this,"Model can't be Loaded",
//                            Toast.LENGTH_SHORT).show();
//                    return null;
//                });
//    }


    void setUpModel() {
        MaterialFactory.makeOpaqueWithColor(this, new Color(android.graphics.Color.RED))
                .thenAccept(material -> {
                    modelRenderable = ShapeFactory.makeSphere(0.2f, new Vector3(0, 0.2f, 0.2f), material);
                });
    }

//    void setUpModel() {
//        MaterialFactory.makeOpaqueWithColor(this, new Color(android.graphics.Color.MAGENTA))
//                .thenAccept(material -> {
//                    modelRenderable = ShapeFactory.makeCube(new Vector3(0, 0.2f, 0.2f),new Vector3(0, 0.2f, 0.2f),material);
//                });
//    }
//        void setUpModel() {
//        MaterialFactory.makeOpaqueWithColor(this, new Color(android.graphics.Color.GREEN))
//                .thenAccept(material -> {
//                    modelRenderable = ShapeFactory.makeCylinder(0.2f,0.3f,new Vector3(0, 0.2f, 0.2f),material);
//                });
//    }
}