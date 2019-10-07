package calculadora;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Principal {
	private static Text txtUnidades;
	private static Text txtPrecio;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		txtUnidades = new Text(shell, SWT.BORDER);
		txtUnidades.setBounds(200, 25, 76, 21);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(111, 28, 55, 15);
		lblNewLabel.setText("unidades");
		
		txtPrecio = new Text(shell, SWT.BORDER);
		txtPrecio.setBounds(200, 64, 76, 21);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(111, 67, 55, 15);
		lblNewLabel_1.setText("precio");
		
		Button btnCalcular = new Button(shell, SWT.NONE);
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				double doble = Double.parseDouble(txtUnidades.getText());
				double doble2 = Double.parseDouble(txtPrecio.getText());
				double multi = doble * doble2;
				Label lblNewLabel_2 = new Label(shell, SWT.NONE);
				lblNewLabel_2.setBounds(149, 188, 157, 52);
				System.out.println(multi);
				lblNewLabel_2.setText("el precio es: "+multi);
			}
		});
		btnCalcular.setBounds(165, 124, 75, 25);
		btnCalcular.setText("calcular");
		
		

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
