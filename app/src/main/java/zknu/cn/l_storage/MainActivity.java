package zknu.cn.l_storage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnInternal,btnExternal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnExternal=(Button)findViewById(R.id.btn_external);
        btnInternal=(Button)findViewById(R.id.btn_internal);

        btnInternal.setOnClickListener(this);
        btnExternal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_internal:
                startActivity(new Intent(this,InternalActivity.class));
                break;
            case R.id.btn_external:
                startActivity(new Intent(this,ExternalActivity.class));
                break;
        }
    }
}
