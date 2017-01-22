package appstudylive.weebly.com.stopwatch;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private int seconds=0;
  private boolean run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);runtimer();
    }


    public void onStart(View view)
    {
        run=true;   }
    public void onStop(View view)
    {
        run=false;
    }
    public void onReset(View view)
    {
        run=false;
        seconds=0;
    }
private void runtimer()
{
    final TextView text=(TextView)findViewById(R.id.text);
final Handler thread=new Handler();
thread.post(new Runnable() {
    @Override
    public void run() {
        int hours=seconds/3600;int mins=(seconds)/60;int secs=seconds%60;  String time=String.format("%d:%02d:%02d",hours,mins,secs);text.setText(time);   if(run) {
seconds++;}thread.postDelayed(this,1000);
}
});
}
}