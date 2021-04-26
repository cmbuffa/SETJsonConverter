package py.com.cmbo.clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import com.poiji.option.PoijiOptions.PoijiOptionsBuilder;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;


public class SETJsonConverterJ {

	private JFrame frmConversorExcelA;
	private JTextField txtArchivo;
	private String path;
	private JLabel lblNewLabel;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SETJsonConverterJ window = new SETJsonConverterJ();
					window.frmConversorExcelA.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SETJsonConverterJ() {
		initialize();
		
		path = CurrentPath();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversorExcelA = new JFrame();
		frmConversorExcelA.setTitle("Conversor Excel a Json para Declaraciones SET");
		frmConversorExcelA.setBounds(100, 100, 450, 128);
		frmConversorExcelA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorExcelA.getContentPane().setLayout(null);
		
		txtArchivo = new JTextField();
		txtArchivo.setBounds(10, 27, 414, 20);
		frmConversorExcelA.getContentPane().add(txtArchivo);
		txtArchivo.setColumns(10);
		
		JButton cmdAbrir = new JButton("Abrir Excel");
		cmdAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				File myFilename;
				JFileChooser chooser = new JFileChooser();
				chooser.addChoosableFileFilter(new OpenFileFilter("xls","Planilla Excel 97-2000 (.xls)") );
				chooser.addChoosableFileFilter(new OpenFileFilter("xlsx","Planilla Excel (.xlsx)") );
				chooser.setFileFilter(chooser.getChoosableFileFilters()[2]);
				int returnVal = chooser.showOpenDialog(frmConversorExcelA);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
				     myFilename = chooser.getSelectedFile();
				     txtArchivo.setText(myFilename.getAbsolutePath());
				     
				     ReadExcel(myFilename);
				}				
			}
		});
		cmdAbrir.setBounds(324, 58, 100, 23);
		frmConversorExcelA.getContentPane().add(cmdAbrir);
		
		lblNewLabel = new JLabel("Contacto: cmbuffa@gmail.com");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(10, 62, 268, 14);
		frmConversorExcelA.getContentPane().add(lblNewLabel);
	}
	private void ReadExcel(File file) {
		
		try {
			Declaracion declaracion = new Declaracion();
			
			declaracion.setInformante(Poiji.fromExcel(file, Informante.class,setSheet(0)).get(0));
			
			declaracion.setIdentificacion(Poiji.fromExcel(file, Identificacion.class,setSheet(1)).get(0));
			
			declaracion.setIngresos(Poiji.fromExcel(file, Ingreso.class,setSheet(2)));
			
			declaracion.setEgresos(Poiji.fromExcel(file, Egreso.class,setSheet(3)));
			
			declaracion.setFamiliares(Poiji.fromExcel(file, Familiar.class,setSheet(4)));
			
			ObjectMapper mapper = new ObjectMapper();
			
			mapper.writeValue(new File(path+"\\declaracion.json"), declaracion);
			
			JOptionPane.showMessageDialog(null, "Archivo creado en: "+path+"\\declaracion.json", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
			//System.out.println(mapper.writeValueAsString(declaracion));
			
		
		} catch (JsonProcessingException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "" , JOptionPane.ERROR_MESSAGE);
		} catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage(), "" , JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private String CurrentPath() {
		
		return System.getProperty("user.dir");
	}
	
	
	
	private PoijiOptions setSheet(int i) {
		return PoijiOptionsBuilder.settings().sheetIndex(i).build();
	}
}
