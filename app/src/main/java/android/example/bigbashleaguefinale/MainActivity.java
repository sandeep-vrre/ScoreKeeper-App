package android.example.bigbashleaguefinale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Score Count for Sydney Thunders
      int runsSydneyThunders = 0;
   // Score Count for Renegades
      int runsscoreRenegades = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays Runs Scored by Sydney Thunders
     */
    public void displayForSydneyThunders(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sydney_thunders_runs);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Adds Six Runs Scored by Sydney Thunders
     */
    public void addSixRunsForSydneyThunders(View view){
        runsSydneyThunders=runsSydneyThunders + 6;
        displayForSydneyThunders(runsSydneyThunders);
    }
    /**
     * Adds Four Runs Scored by Sydney Thunders
     */
    public void addFourRunsForSydneyThunders(View view){
        runsSydneyThunders=runsSydneyThunders + 4;
        displayForSydneyThunders(runsSydneyThunders);
    }
    /**
     * Adds Double Runs Scored by Sydney Thunders
     */
    public void addTwoRunsForSydneyThunders(View view){
        runsSydneyThunders=runsSydneyThunders + 2;
        displayForSydneyThunders(runsSydneyThunders);
    }
    /**
     * Adds Single Run Scored by Sydney Thunders
     */
    public void addOneRunsForSydneyThunders(View view){
        runsSydneyThunders=runsSydneyThunders + 1;
        displayForSydneyThunders(runsSydneyThunders);
    }
    /**
     * No Ball Adds One Extra Run to Sydney Thunders
     */
    public void extraOneRunForSydneyThunders(View view){
        runsSydneyThunders=runsSydneyThunders + 1;
        displayForSydneyThunders(runsSydneyThunders);
    }
    /**
     * Wide Ball Adds One Extra Run to Sydney Thunders
     */
    public void penalOneRunForSydneyThunders(View view){
        runsSydneyThunders=runsSydneyThunders + 1;
        displayForSydneyThunders(runsSydneyThunders);
    }
    /**
     * Displays Runs Scored by Renegades
     */
    public void displayForRenegades(int score) {
        TextView scoreView = (TextView) findViewById(R.id.renegades_runs);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays Six Runs Scored by Renegades
     */
    public void addSixRunsForRenegades(View view){
        runsscoreRenegades=runsscoreRenegades + 6;
        displayForRenegades(runsscoreRenegades);}
    /**
     * Displays Four Runs Scored by Renegades
     */
    public void addFourRunsForRenegades(View view){
        runsscoreRenegades=runsscoreRenegades + 4;
        displayForRenegades(runsscoreRenegades);}
    /**
     * Displays two Runs Scored by Renegades
     */
    public void addTwoRunsForRenegades(View view){
        runsscoreRenegades=runsscoreRenegades + 2;
        displayForRenegades(runsscoreRenegades);}
    /**
     * Displays one Run Scored by Renegades
     */
    public void addOneRunsForRenegades(View view){
        runsscoreRenegades=runsscoreRenegades + 1;
        displayForRenegades(runsscoreRenegades);}
    /**
     * No Ball Adds One Extra Run to Renegades
     */
    public void extraOneRunForRenegades(View view){
        runsscoreRenegades=runsscoreRenegades + 1;
        displayForRenegades(runsscoreRenegades);}
    /**
     * Wide Ball Adds One Extra Run to Renegades
     */
    public void penalOneRunForRenegades(View view){
        runsscoreRenegades=runsscoreRenegades + 1;
        displayForRenegades(runsscoreRenegades);}
/**
 * Resets The Runs Scored By Sydney Thunders and Renegades
 */
    public void runsReset (View view) {
    runsSydneyThunders = 0;
    runsscoreRenegades = 0;
    displayForRenegades(0);
    displayForSydneyThunders(0);
    }
}
