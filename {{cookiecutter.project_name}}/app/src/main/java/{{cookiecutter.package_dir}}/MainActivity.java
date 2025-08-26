package {{ cookiecutter.package_name }};

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import {{ cookiecutter.package_name }}.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.helloText.setText("Hello from Cookiecutter Android Java!");
    }
}
