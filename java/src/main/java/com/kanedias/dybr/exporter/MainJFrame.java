/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kanedias.dybr.exporter;

import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.io.File;

/**
 * @author Darina
 */
public class MainJFrame extends JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton buttonDir;
    private JButton buttonHtmlDir;
    private JButton button_html_start;
    private JButton buttonStart;
    private JCheckBox checkAdd;
    private JCheckBox checkImg;
    private JCheckBox checkOldImg;
    private JTextArea errorText;
    private JTextField htmlTextDir;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JTabbedPane jTabbedPane1;
    private JLabel labelResult;
    private JLabel labelResultHtml;
    private JTextField textDir;
    private JTextField textLogin;
    private JPasswordField textPass;
    // End of variables declaration//GEN-END:variables

    public MainJFrame() {
        setTitle("Миграция дневников с diary.ru на dybr.ru");

        initComponents();
        checkOldImgSetVisibility();
        this.setVisible(true);
    }

    public void printInfo(Object o) {
        labelResult.setText(o.toString());
    }

    public void printHtmlInfo(Object o) {
        labelResultHtml.setText(o.toString());
    }

    public void printErrorInfo(int i) {
        switch (i) {
            case -1:
                errorText.setText("Не удалось создать лог-файл");
                break;
            case 0:
                errorText.setText("diary не ответил на запрос. Попробуйте перезапустить программу еще раз позже.");
                break;
            case 1:
                errorText.setText("В старых файлах нет поля хэша. Лучше выкачайте их заново.");
                break;
            case 2:
                errorText.setText("Во время выкачки произошли ошибки. Вы можете отправить отчет в группу вконтакте vk.com/aboutdybr или на почту support@dybr.ru\nФайл отчета diary_exporter_log_file.log");
                break;
        }

    }

    public String getLogin() {
        return textLogin.getText();
    }

    public String getPass() {
        return textPass.getText();
    }

    public String getDir() {
        return textDir.getText();
    }

    public String getHtmlDir() {
        return htmlTextDir.getText();
    }

    public boolean addLoad() {
        return checkAdd.isSelected();
    }

    public boolean loadImage() {
        return checkImg.isSelected();
    }

    public boolean checkLoaded() {
        return checkOldImg.isSelected();
    }

    public void changeEnabled() {
        boolean e = !buttonStart.isEnabled();
        textLogin.setEnabled(e);
        textPass.setEnabled(e);
        textDir.setEnabled(e);
        checkAdd.setEnabled(e);
        checkImg.setEnabled(e);
        buttonDir.setEnabled(e);
        buttonStart.setEnabled(e);
    }

    public void changeHtmlEnabled() {
        boolean e = !button_html_start.isEnabled();
        htmlTextDir.setEnabled(e);
        button_html_start.setEnabled(e);
        button_html_start.setEnabled(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new JTabbedPane();
        jPanel1 = new JPanel();
        textLogin = new JTextField();
        buttonStart = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        textPass = new JPasswordField();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        buttonDir = new JButton();
        textDir = new JTextField();
        checkAdd = new JCheckBox();
        checkImg = new JCheckBox();
        checkOldImg = new JCheckBox();
        jPanel3 = new JPanel();
        labelResult = new JLabel();
        errorText = new JTextArea();
        jPanel2 = new JPanel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        htmlTextDir = new JTextField();
        buttonHtmlDir = new JButton();
        button_html_start = new JButton();
        jLabel7 = new JLabel();
        jPanel4 = new JPanel();
        labelResultHtml = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        setSize(new Dimension(600, 577));

        jTabbedPane1.setMaximumSize(null);

        jPanel1.setMaximumSize(null);

        buttonStart.setText("Начать");
        buttonStart.addActionListener(this::buttonStartActionPerformed);

        jLabel1.setText("<html>\nКОМАНДА ДЫБРА ПРИВЕТСТВУЕТ ВАС!\n<br>\n<br>Пожалуйста, введите данные своей учетной записи.\n<br>Пароль необходим для выгрузки дневника и не будет записан где-либо.");
        jLabel1.setFocusable(false);

        jLabel2.setText("логин:");
        jLabel2.setFocusable(false);

        jLabel3.setText("пароль:");
        jLabel3.setFocusable(false);

        jLabel4.setText("Директория:");
        jLabel4.setFocusable(false);

        buttonDir.setText("...");
        buttonDir.addActionListener(this::buttonDirActionPerformed);

        checkAdd.setText("дополнить существующие файлы");
        checkAdd.addActionListener(this::checkAddActionPerformed);

        checkImg.setText("выгрузить изображения");
        checkImg.addActionListener(this::checkImgActionPerformed);

        checkOldImg.setText("в том числе из загруженных ранее записей");

        jPanel3.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        jPanel3.setDoubleBuffered(false);
        jPanel3.setFocusable(false);

        labelResult.setBackground(new Color(0, 51, 51));
        labelResult.setVerticalAlignment(SwingConstants.TOP);
        labelResult.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        labelResult.setFocusable(false);

        errorText.setEditable(false);
        errorText.setBackground(SystemColor.control);
        errorText.setColumns(20);
        errorText.setForeground(new Color(153, 0, 0));
        errorText.setLineWrap(true);
        errorText.setRows(5);
        errorText.setWrapStyleWord(true);
        errorText.setAlignmentX(0.0F);
        errorText.setAlignmentY(0.0F);
        errorText.setAutoscrolls(false);
        errorText.setBorder(null);
        errorText.setCaretColor(SystemColor.window);
        errorText.setMargin(new Insets(0, 0, 0, 0));
        errorText.setMaximumSize(new Dimension(0, 0));
        errorText.setMinimumSize(new Dimension(0, 0));

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(labelResult, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(errorText, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(1, 1, 1))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(labelResult, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(errorText, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonStart)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(8, 8, 8))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(textPass)
                                                                        .addComponent(textLogin))))
                                                .addGap(10, 10, 10))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(textDir)
                                                .addGap(10, 10, 10)
                                                .addComponent(buttonDir, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(checkOldImg))
                                                        .addComponent(checkImg)
                                                        .addComponent(checkAdd))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(textLogin, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textPass, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonDir, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textDir, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(checkAdd)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkImg)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkOldImg)
                                .addGap(18, 18, 18)
                                .addComponent(buttonStart)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
        );

        jLabel1.getAccessibleContext().setAccessibleName("КОМАНДА ДЫБРА ПРИВЕТСТВУЕТ ВАС!\n\nПожалуйста, введите данные своей учетной записи.\nПароль необходим для выгрузки дневника и не будет записан где-либо.");

        jTabbedPane1.addTab("выгрузка", jPanel1);

        jPanel2.setMaximumSize(null);
        jPanel2.setMinimumSize(null);

        jLabel5.setText("Директория:");
        jLabel5.setFocusable(false);

        jLabel6.setText("<html>Здесь вы можете создать версию архива для чтения с минимальным форматированием. \n<br><br>\nНичего скачивать заново не нужно. Просто выберите папку, где лежат json-файлы с вашими записями (diary_*shortname*)\n<br><br>\nПрограмма создаст рядом папку diary_*shortname*_html");
        jLabel6.setFocusable(false);

        buttonHtmlDir.setText("...");
        buttonHtmlDir.addActionListener(this::buttonHtmlDirActionPerformed);

        button_html_start.setText("Создать файлы");
        button_html_start.addActionListener(this::buttonHtmlStartActionPerformed);

        jLabel7.setText("<html>*изображения для архива не скачиваются и потому зависят от ресурсов, на которых расположены</html>");

        jPanel4.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        jPanel4.setDoubleBuffered(false);
        jPanel4.setFocusable(false);

        labelResultHtml.setBackground(new Color(0, 51, 51));
        labelResultHtml.setVerticalAlignment(SwingConstants.TOP);
        labelResultHtml.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        labelResultHtml.setFocusable(false);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelResultHtml, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelResultHtml, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
        );

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(htmlTextDir)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonHtmlDir, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(button_html_start)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jPanel4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(htmlTextDir, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonHtmlDir, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(button_html_start)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("html", jPanel2);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkImgActionPerformed(ActionEvent evt) {//GEN-FIRST:event_check_imgActionPerformed
        checkOldImgSetVisibility();
    }//GEN-LAST:event_check_imgActionPerformed

    private void checkAddActionPerformed(ActionEvent evt) {//GEN-FIRST:event_check_addActionPerformed
        checkOldImgSetVisibility();
    }//GEN-LAST:event_check_addActionPerformed

    private void buttonStartActionPerformed(ActionEvent evt) {//GEN-FIRST:event_button_startActionPerformed
        labelResult.setText("");
        errorText.setText("");
        changeEnabled();
        new Thread(new DiaryExporter(this)).start();
    }//GEN-LAST:event_button_startActionPerformed

    private void buttonDirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_button_dirActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setDialogTitle("Choose parent imgDir:");
        fc.setCurrentDirectory(new File(""));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            textDir.setText(fc.getSelectedFile().toString());
        }
    }//GEN-LAST:event_button_dirActionPerformed

    private void buttonHtmlStartActionPerformed(ActionEvent evt) {//GEN-FIRST:event_button_html_startActionPerformed
        changeHtmlEnabled();
        labelResultHtml.setText("");
        new Thread(new JsonToHtml(this)).start();
    }//GEN-LAST:event_button_html_startActionPerformed

    private void buttonHtmlDirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_button_html_dirActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setDialogTitle("Choose parent imgDir:");
        fc.setCurrentDirectory(new File(""));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            htmlTextDir.setText(fc.getSelectedFile().toString());
        }
    }//GEN-LAST:event_button_html_dirActionPerformed

    private void checkOldImgSetVisibility() {
        if (checkAdd.isSelected() && checkImg.isSelected()) {
            checkOldImg.setEnabled(true);
        } else {
            checkOldImg.setEnabled(false);
        }
    }
}
