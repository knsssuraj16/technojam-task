package in.knsssuraj.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class FullScreenActivity extends AppCompatActivity {

    ImageView imageView;
    TextView name,des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageView= findViewById(R.id.logo);
        name= findViewById(R.id.name);
        des=  findViewById(R.id.des);


        Picasso.get().load(getIntent().getStringExtra("image")).placeholder(R.drawable.c).into(imageView);

        name.setText(getIntent().getStringExtra("name"));
       des.setText(getIntent().getStringExtra("des"));

    }
}