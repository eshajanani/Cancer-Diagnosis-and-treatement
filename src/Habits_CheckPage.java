
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import java.io.InputStream;
import java.util.ArrayList;
import static com.hp.hpl.jena.assembler.JA.Model;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.util.FileManager;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Janani
 */
public class Habits_CheckPage extends javax.swing.JFrame {

      ArrayList<String> cancer_name = new ArrayList<String>();
      ArrayList<String> causes_list = new ArrayList<String>();
        ArrayList<String> cancer_caused = new ArrayList<String>();
      	ArrayList<String> tests_list = new ArrayList<String>();
      
    /**
     * Creates new form Habits_CheckPage
     */
    public Habits_CheckPage(ArrayList<String> cancer_list) {
        initComponents();
        this.cancer_name = cancer_list;
        System.out.println("cancer list in habits page :" + cancer_name);
    }

    public Habits_CheckPage()
    {
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        HabitsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Cancer Diagonsis and Treatment");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jCheckBox1.setText("Alcohol");

        jCheckBox2.setText("Smoking");

        jCheckBox3.setText("Tobacco");

        jCheckBox4.setText("Blood Pressure");

        jCheckBox5.setText("Diabetes");

        jCheckBox6.setText("Fair Skin");

        jCheckBox7.setText("Family History");

        jCheckBox8.setText("Heart Attack");

        jCheckBox9.setText("Uncontrolled Cell growth");

        jCheckBox10.setText("High Fat Intake");

        jCheckBox11.setText("Irregular Moles");

        jCheckBox12.setText("Obseity");

        jCheckBox13.setText("Smoke");

        HabitsBtn.setText("Submit");
        HabitsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabitsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox11, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(jCheckBox12, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(HabitsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(483, Short.MAX_VALUE)
                    .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox6)
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(HabitsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HabitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabitsBtnActionPerformed
      
       ArrayList<String> Common_cancer= causesQueryProcess();
         testQueryProcess(Common_cancer);       
        
        this.setVisible(false);
        new Diagnosis().setVisible(false);
        new Drugs_ListPage().setVisible(false);
        //new Habits_CheckPage().setVisible(true);
        new CurrentLocation().setVisible(false);
        new Route_ExitPage().setVisible(false);
        new TestCheckPage(tests_list,Common_cancer).setVisible(true);
        new Test_SuggestionPage().setVisible(false);
        new Test_ResultPage().setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_HabitsBtnActionPerformed
public void getCauseList()
{

    if(jCheckBox1.isSelected())
    {
        causes_list.add(jCheckBox1.getText().replace(" ","_"));
    }
    
    if(jCheckBox2.isSelected())
    {
        causes_list.add(jCheckBox2.getText().replace(" ","_"));
    }
    if(jCheckBox3.isSelected())
    {
        causes_list.add(jCheckBox3.getText().replace(" ","_"));
    }
    if(jCheckBox4.isSelected())
    {
        causes_list.add(jCheckBox4.getText().replace(" ","_"));
    }
    if(jCheckBox5.isSelected())
    {
        causes_list.add(jCheckBox5.getText().replace(" ","_"));
    }
    if(jCheckBox6.isSelected())
    {
        causes_list.add(jCheckBox6.getText().replace(" ","_"));
    }
    if(jCheckBox7.isSelected())
    {
        causes_list.add(jCheckBox7.getText().replace(" ","_"));
    }
      if(jCheckBox8.isSelected())
    {
        causes_list.add(jCheckBox8.getText().replace(" ","_"));
    }
      
      
        if(jCheckBox9.isSelected())
    {
        causes_list.add(jCheckBox9.getText().replace(" ","_"));
    }
        
        
          if(jCheckBox10.isSelected())
    {
        causes_list.add(jCheckBox10.getText().replace(" ","_"));
    }
          
            if(jCheckBox11.isSelected())
    {
        causes_list.add(jCheckBox11.getText().replace(" ","_"));
    }
              if(jCheckBox12.isSelected())
    {
        causes_list.add(jCheckBox12.getText().replace(" ","_"));
    }
              
                if(jCheckBox13.isSelected())
    {
        causes_list.add(jCheckBox13.getText().replace(" ","_"));
    }
    
              
}
    
    public ArrayList<String> causesQueryProcess()
    {
        
        getCauseList();
       System.out.print("Cause list is: "+ causes_list);
       
       
       Model model = ModelFactory.createDefaultModel();
			InputStream in = FileManager.get().open( "cancer_rdf.owl" );
			if (in == null) {
			    throw new IllegalArgumentException("File: not found");
			}
                        // read the RDF/XML file
			model.read(in, null);	
        for(int i=0;i< causes_list.size();i++){
		

				
				String cause= causes_list.get(i);
			issueSPARQLCauses(model,cause,cancer_caused);
			}
			System.out.println("cancer for causes: " + cancer_caused);
                        
                        	// *************** cancer for causes and symptoms *******************
			ArrayList<String> common_cancer= new ArrayList<String>(cancer_caused);
			common_cancer.retainAll(cancer_name);
			
			System.out.println("cancer for causes and symptoms: " + common_cancer);
         model.close();
         return common_cancer;
    }
    
     public void testQueryProcess(ArrayList<String> common_cancer)
    {
        
        Model model = ModelFactory.createDefaultModel();
			InputStream in = FileManager.get().open( "cancer_rdf.owl" );
			if (in == null) {
			    throw new IllegalArgumentException("File: not found");
			}
                        // read the RDF/XML file
			model.read(in, null);	
                        
                        
                        
			for(int i=0;i< common_cancer.size();i++){
				
				
				String cancer= common_cancer.get(i);
			issueSPARQLTests(model,cancer,tests_list);
			}
			System.out.println("Tests for cancer predicted: " + tests_list);
                        
                        
        
         model.close();
        
        }
    // method to get test list for cancer 
	 public static void issueSPARQLTests(Model m,String cancer, ArrayList<String> t_list)
		{
		 /****************************************Getting test name type by cancer name*********************************************************/
			String causes_val=cancer;
		//	String drug="HPV";
			String defaultNameSpace = "http://www.semanticweb.org/janani/ontologies/2015/3/cancer-treatment#";
			String willCauseNameSpace="<http://www.semanticweb.org/janani/ontologies/2015/3/cancer-treatment#hasTests>";
			String ntemp1="<"+defaultNameSpace+causes_val+">";
			String temp1="";


			//temp1 =temp1+causes+" "+"?p"+" " +"?Disease " + " ." ;
			temp1= temp1+ntemp1+" "+willCauseNameSpace+" ?tests";
			String queryStringDrug = 
					"SELECT   ?tests "+
							"WHERE {"+ temp1 +
							"   }";


			System.out.println(queryStringDrug);

			Query query1 = QueryFactory.create(queryStringDrug);
			QueryExecution qe1 = QueryExecutionFactory.create(query1, m);

			ResultSet results1 = qe1.execSelect();
			
			//	ResultSetFormatter.out(System.out, results1, query1);
			
			RDFNode test_name;
			

			while( results1.hasNext() ) 
			{
				String[] t_name;
				 QuerySolution querySolution = results1.next();
				 test_name=querySolution.get("tests");
				 String temp_val =String.valueOf(test_name);
				 t_name= temp_val.split("#");
				 if(!t_list.contains(t_name[1]))
				 {
					 t_list.add(t_name[1]);
				 }
				 
			}
			
			
		 
		}
    
    
		// method to get cancer name given causes list
			 public static void issueSPARQLCauses(Model m, String cause, ArrayList<String> c_name)
				{
				 			 
				 /****************************************Getting Cancer type by causes*********************************************************/
					String causes=cause;
				//	String drug="HPV";
					String defaultNameSpace = "http://www.semanticweb.org/janani/ontologies/2015/3/cancer-treatment#";
					String willCauseNameSpace="<http://www.semanticweb.org/janani/ontologies/2015/3/cancer-treatment#willCause>";
					String ntemp1="<"+defaultNameSpace+causes+">";
					String temp1="";


					//temp1 =temp1+causes+" "+"?p"+" " +"?Disease " + " ." ;
					temp1= temp1+ntemp1+" "+willCauseNameSpace+" ?Disease";
					String queryStringDrug = 
							"SELECT   ?Disease "+
									"WHERE {"+ temp1 +
									"   }";

					System.out.println(queryStringDrug);

					Query query1 = QueryFactory.create(queryStringDrug);
					
					
					QueryExecution qe1 = QueryExecutionFactory.create(query1, m);

					ResultSet results1 = qe1.execSelect();
					
				//	ResultSetFormatter.out(System.out, results1, query1);
					
					RDFNode cancer_name;
					

					while( results1.hasNext() ) 
					{
						String[] can_name;
						 QuerySolution querySolution = results1.next();
						 cancer_name=querySolution.get("Disease");
						 String temp_val =String.valueOf(cancer_name);
						 can_name= temp_val.split("#");
						 if(!c_name.contains(can_name[1]))
						 {
							 c_name.add(can_name[1]);
						 }
						 
					}
					
						qe1.close();
				 
				// return c_name;
				}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Habits_CheckPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habits_CheckPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habits_CheckPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habits_CheckPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habits_CheckPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HabitsBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
