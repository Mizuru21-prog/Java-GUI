package LoginRegister;

import java.awt.Color;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DataBase.My_Conx;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mizuru
 */
public class RegisterForm extends javax.swing.JFrame {

    //create a variable to set  the image path in it
    String image_path = null;
    
    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();

        this.setLocationRelativeTo(null);

        // create a black border for global panel
        Border global_Label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanel_Outer.setBorder(global_Label_border);

        // create a background for jLabel_Tittle
        Border tittle_border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.DARK_GRAY);
        jLabel_Tittle.setBorder(tittle_border);

        // create a border for text and password field
        Border Uname_Pass_border = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(153, 153, 255));
        jTextField_Username.setBorder(Uname_Pass_border);
        jTextField_FullName.setBorder(Uname_Pass_border);
        jTextField_Phone.setBorder(Uname_Pass_border);
        jPasswordField_Password.setBorder(Uname_Pass_border);
        jPasswordField_ConfPassword.setBorder((Uname_Pass_border));
        jLabel_Have_Account.setBorder(Uname_Pass_border);

        // create and set black border for jLabel_Minimize
        Border jLabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Minimize.setBorder(jLabel_border);
        jLabel_Close.setBorder(jLabel_border);

        // create border for jLabel_Logo_Perpus
        Border Logo_Perpus_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Logo_Perpus.setBorder(Logo_Perpus_border);
        
        //create button gorup for radio button
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_Male);
        bg.add(jRadioButton_Famale);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Outer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton_Register = new javax.swing.JButton();
        jLabel_FullName = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel_Password = new javax.swing.JLabel();
        jLabel_ConfirmPass = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel_Gender = new javax.swing.JLabel();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Famale = new javax.swing.JRadioButton();
        jLabel_Image = new javax.swing.JLabel();
        jButton_SelectImage = new javax.swing.JButton();
        jLabel_ImagePath = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jPasswordField_ConfPassword = new javax.swing.JPasswordField();
        jTextField_FullName = new javax.swing.JTextField();
        jLabel_Have_Account = new javax.swing.JLabel();
        jButton_Have_Account = new javax.swing.JButton();
        jLabel_Minimize = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Tittle = new javax.swing.JLabel();
        jLabel_Logo_Perpus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_Outer.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jPanel3.setBackground(new java.awt.Color(170, 182, 251));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 500));

        jButton_Register.setBackground(new java.awt.Color(51, 102, 255));
        jButton_Register.setFont(new java.awt.Font("Hack", 1, 18)); // NOI18N
        jButton_Register.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Register.setText("Register");
        jButton_Register.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseExited(evt);
            }
        });
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        jLabel_FullName.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel_FullName.setText("Full Name: ");

        jLabel_Username.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel_Username.setText("Username:");

        jTextField_Username.setBackground(new java.awt.Color(170, 182, 251));
        jTextField_Username.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jTextField_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel_Password.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel_Password.setText("Password:");
        jLabel_Password.setPreferredSize(new java.awt.Dimension(90, 30));

        jLabel_ConfirmPass.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel_ConfirmPass.setText("Confirm Pass:");

        jLabel_Phone.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel_Phone.setText("Phone:");

        jTextField_Phone.setBackground(new java.awt.Color(170, 182, 251));
        jTextField_Phone.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jTextField_Phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Phone.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PhoneActionPerformed(evt);
            }
        });
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jLabel_Gender.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel_Gender.setText("Gender:");

        jRadioButton_Male.setBackground(new java.awt.Color(170, 182, 251));
        jRadioButton_Male.setSelected(true);
        jRadioButton_Male.setText("Male");

        jRadioButton_Famale.setBackground(new java.awt.Color(170, 182, 251));
        jRadioButton_Famale.setText("Female");
        jRadioButton_Famale.setAlignmentX(0.5F);

        jLabel_Image.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel_Image.setText("Image:");

        jButton_SelectImage.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButton_SelectImage.setText("select image");
        jButton_SelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectImageActionPerformed(evt);
            }
        });

        jLabel_ImagePath.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel_ImagePath.setText("image path");

        jPasswordField_Password.setBackground(new java.awt.Color(170, 182, 251));
        jPasswordField_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_Password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPasswordField_ConfPassword.setBackground(new java.awt.Color(170, 182, 251));
        jPasswordField_ConfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_ConfPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextField_FullName.setBackground(new java.awt.Color(170, 182, 251));
        jTextField_FullName.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jTextField_FullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_FullName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField_FullName.setMinimumSize(new java.awt.Dimension(320, 28));
        jTextField_FullName.setPreferredSize(new java.awt.Dimension(320, 28));

        jLabel_Have_Account.setText("Have an Account?");

        jButton_Have_Account.setBackground(new java.awt.Color(51, 102, 255));
        jButton_Have_Account.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Have_Account.setText("Sign In");
        jButton_Have_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Have_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Have_AccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_Have_AccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_Have_AccountMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_FullName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Username)
                            .addComponent(jLabel_ConfirmPass)
                            .addComponent(jLabel_Phone)
                            .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField_ConfPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Gender)
                            .addComponent(jLabel_Image))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel_Have_Account)
                                .addGap(30, 30, 30)
                                .addComponent(jButton_Have_Account))
                            .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton_Male)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Famale))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton_SelectImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FullName))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_ConfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Male)
                    .addComponent(jRadioButton_Famale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_SelectImage)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ImagePath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Have_Account)
                    .addComponent(jButton_Have_Account))
                .addGap(26, 26, 26))
        );

        jLabel_Minimize.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel_Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Minimize.setText("-");
        jLabel_Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseExited(evt);
            }
        });

        jLabel_Close.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close.setText("X");
        jLabel_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseExited(evt);
            }
        });

        jLabel_Tittle.setFont(new java.awt.Font("Suravaram", 0, 36)); // NOI18N
        jLabel_Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Tittle.setText("REGISTER");

        jLabel_Logo_Perpus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Logo_Perpus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoPerpus.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Logo_Perpus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel_Tittle)
                .addGap(87, 87, 87)
                .addComponent(jLabel_Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Minimize)
                        .addComponent(jLabel_Close))
                    .addComponent(jLabel_Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Logo_Perpus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_OuterLayout = new javax.swing.GroupLayout(jPanel_Outer);
        jPanel_Outer.setLayout(jPanel_OuterLayout);
        jPanel_OuterLayout.setHorizontalGroup(
            jPanel_OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OuterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_OuterLayout.setVerticalGroup(
            jPanel_OuterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OuterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Outer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseEntered

        // set jButton background
        jButton_Register.setBackground(new Color(255, 153, 153));
        jButton_Register.setForeground(Color.black);

    }//GEN-LAST:event_jButton_RegisterMouseEntered

    private void jButton_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseExited

        // set jButton background
        jButton_Register.setBackground(new Color(51, 102, 255));
        jButton_Register.setForeground(Color.white);
    }//GEN-LAST:event_jButton_RegisterMouseExited

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed

        String fname = jTextField_FullName.getText();
        String username = jTextField_Username.getText();
        String pass1 = String.valueOf(jPasswordField_Password.getPassword());
        String pass2 = String.valueOf(jPasswordField_ConfPassword.getPassword());
        String phone = jTextField_Phone.getText();
        String gender = "Male";
        
        if(jRadioButton_Famale.isSelected())
        {
            gender = "Female";
        }
        
        if(verifyFields())
        {
            if(!checkUsername(username))
            {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `users`(`full_name`, `username`, `password`, `phone`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
                
                try {
                    
                    ps = My_Conx.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, fname);
                    ps.setString(2, username);
                    ps.setString(3, pass1);
                    ps.setString(4, phone);
                    ps.setString(5, gender);
                    
                    try {
                        
                        // save image as blob in the database
                        if(image_path != null)
                        {
                            InputStream image = new FileInputStream(new File(image_path));
                            ps.setBlob(6, image);
                        }
                        else
                        {
                            ps.setNull(6, java.sql.Types.NULL);
                        }
                        
                        if(ps.executeUpdate() != 0)
                        {
                            JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                        }
                        
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
            }
        }

    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked

        // to minimize when clicked
        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jLabel_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseEntered

        Border jLabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        jLabel_Minimize.setBorder(jLabel_border);
        jLabel_Minimize.setForeground(Color.red);

    }//GEN-LAST:event_jLabel_MinimizeMouseEntered

    private void jLabel_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseExited

        Border jLabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Minimize.setBorder(jLabel_border);
        jLabel_Minimize.setForeground(Color.black);

    }//GEN-LAST:event_jLabel_MinimizeMouseExited

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked

        // to close program
        System.exit(0);

    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseEntered

        Border jLabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        jLabel_Close.setBorder(jLabel_border);
        jLabel_Close.setForeground(Color.red);

    }//GEN-LAST:event_jLabel_CloseMouseEntered

    private void jLabel_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseExited

        Border jLabel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Close.setBorder(jLabel_border);
        jLabel_Close.setForeground(Color.black);

    }//GEN-LAST:event_jLabel_CloseMouseExited

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        
        //allow only numbers
        if(!Character.isDigit(evt.getKeyChar()))
           evt.consume();
        
    }//GEN-LAST:event_jTextField_PhoneKeyTyped

    private void jButton_SelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectImageActionPerformed
        
        //select an image and set the image path into the jLabel_ImagePath
        String path = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        //file extension
        FileNameExtensionFilter extension = new FileNameExtensionFilter("*Images","jpg","png","jpeg");
        chooser.addChoosableFileFilter(extension);
        
        int filestate = chooser.showSaveDialog(null);
        
        // check if the user select an image
        if(filestate == JFileChooser.APPROVE_OPTION){
            File selectedImage = chooser.getSelectedFile();
            path = selectedImage.getAbsolutePath();
            jLabel_ImagePath.setText(path);
            
            image_path = path;
        }
        
    }//GEN-LAST:event_jButton_SelectImageActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jButton_Have_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Have_AccountMouseClicked
        LoginForm lg = new LoginForm();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_Have_AccountMouseClicked

    private void jButton_Have_AccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Have_AccountMouseEntered
        jButton_Have_Account.setBackground(new Color(255, 153, 153));
        jButton_Have_Account.setForeground(Color.black);
    }//GEN-LAST:event_jButton_Have_AccountMouseEntered

    private void jButton_Have_AccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Have_AccountMouseExited
        jButton_Have_Account.setBackground(new Color(51, 102, 255));
        jButton_Have_Account.setForeground(Color.white);
    }//GEN-LAST:event_jButton_Have_AccountMouseExited

   // create a function  to verify the empty fields  
    public boolean verifyFields()
    {
        String fname = jTextField_FullName.getText();
        String uname = jTextField_Username.getText();
        String phone = jTextField_Phone.getText();
        String pass1 = String.valueOf(jPasswordField_Password.getPassword());
        String pass2 = String.valueOf(jPasswordField_ConfPassword.getPassword());
        
        // check empty fields
        if(fname.trim().equals("") || uname.trim().equals("") || phone.trim().equals("")
                || pass1.trim().equals("") || pass2.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty", "Empty Fields", 2);
            return false;
        }
            
        // check if the the password and confirm password is equal 
        else if(!pass1.equals(pass2))
        {
            JOptionPane.showMessageDialog(null, "Password Doesn't Match", "Confirm password", 2);
            return false;
        }
        
        // if everything okay
        else
        {
            return true;
        }
    }
    
    // Create a function  to check if the entered username already exists in the database 
    public boolean checkUsername(String username)
    {
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `users` WHERE `username` = ?";
        
        try {
            
            st = My_Conx.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
    }
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Have_Account;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JButton jButton_SelectImage;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_ConfirmPass;
    private javax.swing.JLabel jLabel_FullName;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Have_Account;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JLabel jLabel_Logo_Perpus;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JLabel jLabel_Tittle;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Outer;
    private javax.swing.JPasswordField jPasswordField_ConfPassword;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JRadioButton jRadioButton_Famale;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JTextField jTextField_FullName;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}