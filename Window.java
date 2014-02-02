/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcmap;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Tomek
 */
public class Window extends javax.swing.JFrame {
        
    /**
     * Creates new form NewJFrame
     */
    public Window() {
        main(null);
        initComponents();
        
        String[] combomodel = new String[30];
        for (int i = 0; i < 30; ) {
            combomodel[i] = "Item " + ++i;
        }
        
        File appdata = new File(System.getenv("APPDATA")+"\\.minecraft\\saves");
        File[] files = appdata.listFiles();
        int dirs = 0;
        for (File file: files)
        {
            if (file.isDirectory())
            {
                //System.out.println(file.getName());
                dirs++;
            }
        }
        String[] combomodell = new String[dirs];
        int j = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory())
            combomodell[j++] = files[i].getName();
        }
        
        ComboSelectWorld.setModel(new javax.swing.DefaultComboBoxModel(combomodell));
        ComboSelectWorld.setSelectedItem(null);
        
        //System.out.println(System.getenv());
        //lTitle.setText("<html><img src=file:///D:\\Dropbox\\NetBeansProjects\\mcmap\\East-wyjebmnienazbityryj.png></html>");

        this.setVisible(true);

        /*
        addWindowListener(new WindowAdapter() {
  public void windowClosing(WindowEvent e) {
    int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to exit the program?", "Exit Program Message Box",
        JOptionPane.YES_NO_OPTION);

    if (confirmed == JOptionPane.YES_OPTION) {
      dispose();
    }
  }
});
        */
        
        if (new RunMe("mcmap64.exe",this).check())
        {
            mcmapEXE = "mcmap64.exe";
            checkBox64bit.setEnabled(true);
            checkBox64bit.setSelected(true);
        }
        else
        {
            new RunMe("mcmap.exe",this).check();
            mcmapEXE = "mcmap.exe";
            memVal.setMaximum(1159);
        }
        
        //Controller.runProcess("c:\\windows\\system32\\calc.exe");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jProgressBar1 = new javax.swing.JProgressBar();
        lTitle = new javax.swing.JLabel();
        memVal = new javax.swing.JSlider();
        ComboSelectWorld = new javax.swing.JComboBox();
        lOutputFilename = new javax.swing.JLabel();
        lSingleplayerSave = new javax.swing.JRadioButton();
        lCustomPath = new javax.swing.JRadioButton();
        SelectedWorldPath = new javax.swing.JTextField();
        consolePanel = new javax.swing.JScrollPane();
        consoleList = new javax.swing.JList();
        OutputFilename = new javax.swing.JTextField();
        generateMapButton = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        otherParameters = new javax.swing.JTextField();
        lOtherParams = new javax.swing.JLabel();
        lMemoryLimit = new javax.swing.JLabel();
        memLabel = new javax.swing.JLabel();
        newWindowButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTopLeftCorner = new javax.swing.JList();
        lTopLeftCorner = new javax.swing.JLabel();
        checkBox64bit = new javax.swing.JCheckBox();
        lRenderWorld = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listRenderWorld = new javax.swing.JList();
        lRenderType = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listRenderType = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        mInformation = new javax.swing.JMenu();
        mVersion = new javax.swing.JMenuItem();
        mUpdate = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mLanguage = new javax.swing.JMenu();
        mLangEnglish = new javax.swing.JRadioButtonMenuItem();
        mLangPolish = new javax.swing.JRadioButtonMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("mcmap 2.4.2b (2.4.2d update available)");

        lTitle.setText("<html><a style=\"text-decoration:none;cursor:pointer;\" href=\"http://wrim.pl/mcmap/\">Manually Check for updates</a></html>");
        lTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToSite(evt);
            }
        });

        memVal.setMaximum(1400);
        memVal.setMinimum(700);
        memVal.setValue(1081);
        memVal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                zmianaLimituPamieci(evt);
            }
        });

        ComboSelectWorld.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboSelectWorld.setSelectedItem(null);
        ComboSelectWorld.setToolTipText("");
        ComboSelectWorld.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                WybranoSwiat(evt);
            }
        });

        lOutputFilename.setText("Output filename");

        lSingleplayerSave.setText("Singleplayer Save");

        lCustomPath.setText("Custom path");

        consoleList.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        consoleList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        consolePanel.setViewportView(consoleList);

        generateMapButton.setText("Generate map");
        generateMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generujSwiat(evt);
            }
        });

        lOtherParams.setText("Other params");

        lMemoryLimit.setText("Memory limit (use carefuly)");

        memLabel.setText("1795 MB");

        newWindowButton.setText("New window");
        newWindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newWindowClick(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listTopLeftCorner.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "East", "South", "West", "North" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listTopLeftCorner.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listTopLeftCorner.setSelectedIndex(0);
        jScrollPane2.setViewportView(listTopLeftCorner);

        lTopLeftCorner.setText("Top-left corner:");

        checkBox64bit.setSelected(true);
        checkBox64bit.setText("64 bit version");
        checkBox64bit.setEnabled(false);
        checkBox64bit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeVersion(evt);
            }
        });

        lRenderWorld.setText("Render world:");

        listRenderWorld.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Overworld", "Nether", "End" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listRenderWorld.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listRenderWorld.setSelectedIndex(0);
        jScrollPane3.setViewportView(listRenderWorld);

        lRenderType.setText("Render type:");

        listRenderType.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Day", "Night", "Underground", "Overworld + caves" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listRenderType.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listRenderType.setToolTipText("");
        listRenderType.setSelectedIndex(0);
        jScrollPane4.setViewportView(listRenderType);

        jMenuBar1.setToolTipText("");

        mInformation.setText("Information");

        mVersion.setText("Version: 2.4.2b");
        mVersion.setToolTipText("");
        mVersion.setEnabled(false);
        mInformation.add(mVersion);

        mUpdate.setText("Update to: 2.4.2d");
        mInformation.add(mUpdate);
        mInformation.add(jSeparator1);

        jMenuItem1.setText("Changelog");
        mInformation.add(jMenuItem1);

        jMenuItem2.setText("License");
        mInformation.add(jMenuItem2);

        jMenuBar1.add(mInformation);

        mLanguage.setText("Language");

        mLangEnglish.setSelected(true);
        mLangEnglish.setText("English (default)");
        mLangEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLanguageEnglish(evt);
            }
        });
        mLanguage.add(mLangEnglish);

        mLangPolish.setText("Polski (polish)");
        mLangPolish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLanguagePolish(evt);
            }
        });
        mLanguage.add(mLangPolish);

        jMenuBar1.add(mLanguage);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lOutputFilename)
                                        .addComponent(lCustomPath)
                                        .addComponent(lSingleplayerSave, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1)
                                .addComponent(lTopLeftCorner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lRenderWorld, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lRenderType, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboSelectWorld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelectedWorldPath)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newWindowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generateMapButton, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                            .addComponent(consolePanel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OutputFilename, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lMemoryLimit, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(lOtherParams, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(checkBox64bit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(memVal, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(memLabel))
                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(otherParameters))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboSelectWorld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSingleplayerSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCustomPath)
                    .addComponent(SelectedWorldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lOutputFilename)
                    .addComponent(OutputFilename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateMapButton)
                    .addComponent(newWindowButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consolePanel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTopLeftCorner)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(lRenderWorld)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lRenderType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)
                                .addGap(0, 26, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(checkBox64bit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lOtherParams))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMemoryLimit)
                        .addGap(29, 29, 29)
                        .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WybranoSwiat(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_WybranoSwiat
        if (ComboSelectWorld.getSelectedIndex() == -1) return;
        SelectedWorldPath.setText(System.getenv("APPDATA")+"\\.minecraft\\saves\\"
                +ComboSelectWorld.getItemAt(ComboSelectWorld.getSelectedIndex()).toString());
        OutputFilename.setText("East-" + ComboSelectWorld.getItemAt(ComboSelectWorld.getSelectedIndex()).toString() + ".png");
    }//GEN-LAST:event_WybranoSwiat

    private void generujSwiat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generujSwiat
        new RunMe(mcmapEXE+
                " \""+
                SelectedWorldPath.getText()+
                "\" -file \""+
                OutputFilename.getText()+
                "\" -mem "+
                new Integer((int)Math.pow(2,memVal.getValue()/(float)100))+
                " "+
                otherParameters.getText()
                ,this).start();
        
    }//GEN-LAST:event_generujSwiat

    private void zmianaLimituPamieci(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_zmianaLimituPamieci
        memLabel.setText(new Integer((int)Math.pow(2,memVal.getValue()/(float)100)).toString() + " MB");
    }//GEN-LAST:event_zmianaLimituPamieci

    private void newWindowClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newWindowClick
        new Window();
    }//GEN-LAST:event_newWindowClick

    private void goToSite(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToSite
        try{Desktop.getDesktop().browse(new URI("http://wrim.pl/mcmap"));}
        catch(IOException|URISyntaxException e){}
    }//GEN-LAST:event_goToSite

    private void changeLanguageEnglish(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLanguageEnglish
        HashMap<String, String> map = new HashMap<>();
        map.put("lCustomPath", "Custom path");
        map.put("lMemoryLimit", "Memory limit (use carefuly)");
        map.put("lOtherParams", "Other params");
        map.put("lOutputFilename", "Output filename");
        map.put("lSingleplayerSave", "Singleplayer Save");
        map.put("lTitle", "<html><a style=\"text-decoration:none;cursor:pointer;\" href=\"http://wrim.pl/mcmap/\">Manually Check for updates</a></html>");
        map.put("mInformation", "Information");
        map.put("lTopLeftCorner", "Top-left corner:");
        map.put("lRenderWorld", "Render World:");
        map.put("lRenderType", "Render type:");
        map.put("checkBox64bit", "64 bit version");
        map.put("mLanguage", "Language");
        map.put("version", "Verion: ");
        map.put("updateTo", "Update to: ");
        map.put("newWindowButton", "New window");
        map.put("generateMapButton", "Generate map");
        
        map.put("DirectionEast","East");
        map.put("DirectionSouth","South");
        map.put("DirectionWest","West");
        map.put("DirectionNorth","North");
        
        map.put("RenderWorldOverworld","Overworld");
        map.put("RenderWorldNether","Nether");
        map.put("RenderWorldEnd","End");
        
        map.put("RenderTypeDay","Day");
        map.put("RenderTypeNight","Night");
        map.put("RenderTypeUnderground","Underground");
        map.put("RenderTypeCaves","Overworld + caves");
        
        changeLanguage(map);
        mLangEnglish.setSelected(true);
    }//GEN-LAST:event_changeLanguageEnglish

    private void changeLanguagePolish(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLanguagePolish
        HashMap<String, String> map = new HashMap<>();
        map.put("lCustomPath", "Własna ścieżka");
        map.put("lMemoryLimit", "Limit pamięci (używaj ostrożnie)");
        map.put("lOtherParams", "Inne parametry");
        map.put("lOutputFilename", "Nazwa obrazu");
        map.put("lSingleplayerSave", "Domyślna ścieżka");
        map.put("lTitle", "<html><a style=\"text-decoration:none;cursor:pointer;\" href=\"http://wrim.pl/mcmap/\">Ręcznie sprawdź dostępność aktualizacji</a></html>");
        map.put("lTopLeftCorner", "Lewy górny narożnik:");
        map.put("lRenderWorld", "Świat:");
        map.put("lRenderType", "Typ generowania:");
        map.put("checkBox64bit", "Wersja 64 bitowa");
        map.put("mInformation", "Informacje");
        map.put("mLanguage", "Język");
        map.put("version", "Wersja: ");
        map.put("updateTo", "Aktualizuj do ");
        map.put("newWindowButton", "Nowe okno");
        map.put("generateMapButton", "Generuj obraz mapy");
        
        map.put("DirectionEast","Wschód");
        map.put("DirectionSouth","Południe");
        map.put("DirectionWest","Zachód");
        map.put("DirectionNorth","Północ");
        
        map.put("RenderWorldOverworld","Zwykły świat");
        map.put("RenderWorldNether","Nether");
        map.put("RenderWorldEnd","End");
        
        map.put("RenderTypeDay","Dzień");
        map.put("RenderTypeNight","Noc");
        map.put("RenderTypeUnderground","Podziemia");
        map.put("RenderTypeCaves","Zwykły świat + jaskinie");
        
        changeLanguage(map);
        mLangPolish.setSelected(true);
        
    }//GEN-LAST:event_changeLanguagePolish

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void changeVersion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeVersion
        if (checkBox64bit.isSelected())
        {
            mcmapEXE = "mcmap64.exe";
            memVal.setMaximum(1400);
        }
        else
        {
            mcmapEXE = "mcmap.exe";
            memVal.setMaximum(1159);
        }
    }//GEN-LAST:event_changeVersion

    private void changeLanguage(HashMap<String, String> map)
    {
        //setLanguageElement(lCustomPath, "lCustomPath", map);
        lCustomPath.setText(map.get("lCustomPath"));
        lMemoryLimit.setText(map.get("lMemoryLimit"));
        lOtherParams.setText(map.get("lOtherParams"));
        lOutputFilename.setText(map.get("lOutputFilename"));
        lSingleplayerSave.setText(map.get("lSingleplayerSave"));
        lTitle.setText(map.get("lTitle"));
        lTopLeftCorner.setText(map.get("lTopLeftCorner"));
        lRenderWorld.setText(map.get("lRenderWorld"));
        lRenderType.setText(map.get("lRenderType"));
        checkBox64bit.setText(map.get("checkBox64bit"));
        mInformation.setText(map.get("mInformation"));
        mLanguage.setText(map.get("mLanguage"));
        newWindowButton.setText(map.get("newWindowButton"));
        generateMapButton.setText(map.get("generateMapButton"));
        
        mVersion.setText(map.get("version") + "2.4.2b");
        mUpdate.setText(map.get("updateTo") + "2.4.2d");
        
        DefaultListModel model;
        int selected;
        
        selected = listTopLeftCorner.getSelectedIndex();
        model = new DefaultListModel();
        model.addElement(map.get("DirectionEast"));
        model.addElement(map.get("DirectionSouth"));
        model.addElement(map.get("DirectionWest"));
        model.addElement(map.get("DirectionNorth"));
        listTopLeftCorner.setModel(model);
        listTopLeftCorner.setSelectedIndex(selected);
        
        selected = listRenderWorld.getSelectedIndex();
        model = new DefaultListModel();
        model.addElement(map.get("RenderWorldOverworld"));
        model.addElement(map.get("RenderWorldNether"));
        model.addElement(map.get("RenderWorldEnd"));
        listRenderWorld.setModel(model);
        listRenderWorld.setSelectedIndex(selected);
        
        selected = listRenderType.getSelectedIndex();
        model = new DefaultListModel();
        model.addElement(map.get("RenderTypeDay"));
        model.addElement(map.get("RenderTypeNight"));
        model.addElement(map.get("RenderTypeUnderground"));
        model.addElement(map.get("RenderTypeCaves"));
        listRenderType.setModel(model);
        listRenderType.setSelectedIndex(selected);
        
        mLangEnglish.setSelected(false);
        mLangPolish.setSelected(false);
    }

    /**
     * @param args the command line arguments
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
            }
        
        
        try {
            /*            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
            }
            }*/
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
 
            }
        });
                */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboSelectWorld;
    private javax.swing.JTextField OutputFilename;
    private javax.swing.JTextField SelectedWorldPath;
    private javax.swing.JCheckBox checkBox64bit;
    javax.swing.JList consoleList;
    private javax.swing.JScrollPane consolePanel;
    javax.swing.JButton generateMapButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    javax.swing.JProgressBar jProgressBar1;
    javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JRadioButton lCustomPath;
    private javax.swing.JLabel lMemoryLimit;
    private javax.swing.JLabel lOtherParams;
    private javax.swing.JLabel lOutputFilename;
    private javax.swing.JLabel lRenderType;
    private javax.swing.JLabel lRenderWorld;
    private javax.swing.JRadioButton lSingleplayerSave;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lTopLeftCorner;
    private javax.swing.JList listRenderType;
    private javax.swing.JList listRenderWorld;
    private javax.swing.JList listTopLeftCorner;
    private javax.swing.JMenu mInformation;
    private javax.swing.JRadioButtonMenuItem mLangEnglish;
    private javax.swing.JRadioButtonMenuItem mLangPolish;
    private javax.swing.JMenu mLanguage;
    private javax.swing.JMenuItem mUpdate;
    private javax.swing.JMenuItem mVersion;
    private javax.swing.JLabel memLabel;
    private javax.swing.JSlider memVal;
    private javax.swing.JButton newWindowButton;
    private javax.swing.JTextField otherParameters;
    // End of variables declaration//GEN-END:variables

    //static String lang = "Język polski";
    private static String mcmapEXE;

}
