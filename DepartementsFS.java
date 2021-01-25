package bin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DepartementsFS extends JPanel implements ActionListener{
	int choixDeDepartement;
	JLabel departementMI,departementPHY,departementSB,departementCH;
Scanner lire=new Scanner(System.in);
JFrame fenetreFa=new JFrame("DEPARTEMENT");
JFrame fenn=new JFrame();
JPanel panne=new JPanel();
JLabel deParPHY,deParMI,deParBI,deParCH;
JButton deParPHYB,deParMIB,deParBIB,deParCHB,prece,prece1;
public DepartementsFS() {
	presentationDesDepartement();
	fenetreFa.setSize(210,310);
	fenetreFa.setLocationRelativeTo(null);
	fenetreFa.setVisible(true);
	fenetreFa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
public void presentationDesDepartement() {
	JPanel jp=new JPanel();
	JPanel jpe=new JPanel(new BorderLayout());
	JPanel jpj=new JPanel(new BorderLayout());
	jp.setBackground(Color.cyan);
	departementMI=new JLabel("DEPARTEMENT DE MATHS-INF0");
	deParMIB=new JButton("ok");
	deParMIB.setBackground(Color.orange);
	deParMIB.addActionListener(this);
	departementPHY=new JLabel("DEPARTEMENT DE PHYSIQUE");
	deParPHYB=new JButton("ok");
	deParPHYB.setBackground(Color.orange);
	departementSB=new JLabel("DEPARTEMENT DE BIOLOGIES");
	deParBIB=new JButton("ok");
	deParBIB.setBackground(Color.orange);
	departementCH=new JLabel("DEPARTEMENT DE CHIMIE");
	deParCHB=new JButton("ok");
	deParCHB.setBackground(Color.orange);
	prece=new JButton("PRECEDENT");
	prece1=new JButton("QUITTER");
	prece.setBackground(Color.ORANGE);
	prece1.setBackground(Color.ORANGE);
	jp.add(departementMI);
	jp.add(deParMIB);
	jp.add(departementPHY);
	jp.add(deParPHYB);
	jp.add(departementSB);
	jp.add(deParBIB);
	jp.add(departementCH);
	jp.add(deParCHB);
	jpj.add(prece,BorderLayout.WEST);
	jpj.add(prece1,BorderLayout.EAST);
	jpe.add(jp,BorderLayout.CENTER);
	jpe.add(jpj,BorderLayout.SOUTH);
	fenetreFa.setContentPane(jpe);
	prece.addActionListener(this);
	prece1.addActionListener(this);
	}
public void actionPerformed(ActionEvent e) {
	  Object recu=e.getSource();
	if((JButton)recu==deParMIB) {
		new Filiere();
		fenetreFa.dispose();
}
	else if((JButton)recu==prece) {
		new bin.Image();
		fenetreFa.dispose();
}
	else
		System.exit(0);
	}
public static void main(String[] args) {
	DepartementsFS faculte=new DepartementsFS();
}

}