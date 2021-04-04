package in.knsssuraj.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView userProjectRecyclerView;

    ArrayList list,nameLi,desLi;
    Adapterss adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList();
        nameLi = new ArrayList();
        desLi = new ArrayList();
        userProjectRecyclerView = findViewById(R.id.proRecyclerView);

        userProjectRecyclerView.setNestedScrollingEnabled(false);
        userProjectRecyclerView.setLayoutManager(new LinearLayoutManager(this,  LinearLayoutManager.VERTICAL, false));

        userProjectRecyclerView.setHasFixedSize(false);
        userProjectRecyclerView.setNestedScrollingEnabled(false);

        adapter = new Adapterss(MainActivity.this, list,nameLi,desLi);
        userProjectRecyclerView.setAdapter(adapter);

        list.add(R.drawable.html);
        list.add(R.drawable.python);
        list.add(R.drawable.c);
        list.add(R.drawable.cplus);
        list.add(R.drawable.java);
        list.add(R.drawable.js);
        list.add(R.drawable.kotlin);
        list.add(R.drawable.ssharp);

        nameLi.add("HTML");
        nameLi.add("Python");
        nameLi.add("C");
        nameLi.add("C++");
        nameLi.add("Java");
        nameLi.add("Javascript");
        nameLi.add("Kotlin");
        nameLi.add("C#");

        desLi.add("The HyperText Markup Language, or HTML is the standard markup language for documents designed to be displayed in a web browser. It can be assisted by technologies such as Cascading Style Sheets and scripting languages ");
        desLi.add("Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation.");
        desLi.add("C is a general-purpose, procedural computer programming language supporting structured programming, lexical variable scope, and recursion, with a static type system. By design, C provides constructs that map efficiently to typical machine instructions");
        desLi.add("C++ is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language, or \"C with Classes\".");
        desLi.add("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible");
        desLi.add("JavaScript, often abbreviated as JS, is a programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and multi-paradigm. It has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions");
        desLi.add("Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise.");
        desLi.add("C# is a general-purpose, multi-paradigm programming language encompassing static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented, and component-oriented programming disciplines.");

        adapter.notifyDataSetChanged();
    }
}