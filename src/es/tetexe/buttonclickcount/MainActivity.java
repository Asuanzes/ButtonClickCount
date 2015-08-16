package es.tetexe.buttonclickcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
       /*
       	* Comentario realizado en GitHub
	*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	/*
	 * Prueba GitHub Shell
	 * Cambiando 3 líneas de comentario
	 * 12:45 h
	 */
	
	/*
	 * Solucionando nuevo problema en rama HotFix
	 * 
	 */

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast toastMessage = Toast.makeText(this, "The settings y tal", Toast.LENGTH_LONG);
			toastMessage.show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
