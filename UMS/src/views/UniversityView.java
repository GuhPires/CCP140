/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.Student;
import controller.Subject;
import controller.University;
import controller.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author uniegupires
 */
public class UniversityView extends javax.swing.JFrame {
    private University university;
    /**
     * Creates new form UniversityView
     */
    public UniversityView(User user) {
        this.university = University.findUniversity(user.getUsername());
        
        initComponents();
        
        this.updateDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        student_name = new javax.swing.JTextField();
        student_lastname = new javax.swing.JTextField();
        register_student = new javax.swing.JButton();
        student_password = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        subject_name = new javax.swing.JTextField();
        register_subject = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        student_dropdown = new javax.swing.JComboBox<>();
        subject_dropdown = new javax.swing.JComboBox<>();
        add_subject_student = new javax.swing.JButton();
        delete_student = new javax.swing.JButton();
        show_student_history = new javax.swing.JButton();
        show_students_subject = new javax.swing.JButton();
        add_grades = new javax.swing.JButton();
        show_student_subjects = new javax.swing.JButton();
        finish_semester = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        student_subject_dropdown = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        results_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        results = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Cadastrar Alunos");

        jLabel2.setLabelFor(student_name);
        jLabel2.setText("Nome");

        jLabel3.setLabelFor(student_lastname);
        jLabel3.setText("Sobrenome");

        jLabel4.setLabelFor(student_password);
        jLabel4.setText("Senha");

        student_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_lastnameActionPerformed(evt);
            }
        });

        register_student.setText("CADASTRAR");
        register_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_studentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(register_student)
                            .addComponent(student_password, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(student_lastname, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(125, 158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(student_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(student_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(register_student)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Cadastrar Matérias");

        jLabel6.setLabelFor(subject_name);
        jLabel6.setText("Nome");
        jLabel6.setToolTipText("");

        register_subject.setText("CADASTRAR");
        register_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_subjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(subject_name, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(register_subject)
                .addGap(108, 108, 108))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(subject_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(register_subject)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setLabelFor(student_dropdown);
        jLabel7.setText("Aluno");

        jLabel8.setLabelFor(subject_dropdown);
        jLabel8.setText("Matéria");

        student_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_dropdownActionPerformed(evt);
            }
        });

        subject_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject_dropdownActionPerformed(evt);
            }
        });

        add_subject_student.setText("ADD DISCIPLINA");
        add_subject_student.setEnabled(false);
        add_subject_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_subject_studentActionPerformed(evt);
            }
        });

        delete_student.setText("EXCLUIR ALUNO");
        delete_student.setEnabled(false);
        delete_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_studentActionPerformed(evt);
            }
        });

        show_student_history.setText("MOSTRAR HISTORICO");
        show_student_history.setEnabled(false);
        show_student_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_student_historyActionPerformed(evt);
            }
        });

        show_students_subject.setText("MOSTRAR ALUNOS NA DISCIPLINA");
        show_students_subject.setEnabled(false);
        show_students_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_students_subjectActionPerformed(evt);
            }
        });

        add_grades.setText("ADD NOTAS");
        add_grades.setEnabled(false);
        add_grades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_gradesActionPerformed(evt);
            }
        });

        show_student_subjects.setText("MOSTRAR DISCIPLINAS ALUNO");
        show_student_subjects.setEnabled(false);
        show_student_subjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_student_subjectsActionPerformed(evt);
            }
        });

        finish_semester.setText("FINALIZAR SEMESTRE");
        finish_semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish_semesterActionPerformed(evt);
            }
        });

        jLabel10.setLabelFor(student_subject_dropdown);
        jLabel10.setText("Matérias do Aluno");

        student_subject_dropdown.setEnabled(false);
        student_subject_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_subject_dropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finish_semester, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(add_grades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add_subject_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(show_students_subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(show_student_history, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(delete_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(show_student_subjects, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(student_subject_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subject_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(student_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(student_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(student_subject_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(subject_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_subject_student)
                    .addComponent(delete_student))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(show_students_subject)
                    .addComponent(show_student_history))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_grades)
                    .addComponent(show_student_subjects))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finish_semester)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        results_label.setText("SELECIONE UMA OPÇÃO AO LADO");

        results.setEditable(false);
        results.setColumns(20);
        results.setRows(5);
        jScrollPane1.setViewportView(results);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(results_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(results_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_subjectActionPerformed
        String subject = subject_name.getText();

        if (subject.isBlank()) {
            JOptionPane.showMessageDialog(
                null,
                "Preencha o nome da matéria que deseja cadastrar",
                "Erro!",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!this.university.createSubject(subject)) {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possivel cadastrar a matéria",
                "Erro!",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(
            null,
            "Matéria cadastrada com sucesso!",
            "Sucesso!",
            JOptionPane.INFORMATION_MESSAGE);

        subject_name.setText("");
        
        this.updateDropdown();
    }//GEN-LAST:event_register_subjectActionPerformed

    private void add_subject_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_subject_studentActionPerformed
        Subject subject = (Subject) subject_dropdown.getSelectedItem();
        Student student = (Student) student_dropdown.getSelectedItem();
        
        boolean added = this.university.addSubjectToStudent(subject, student);
        
        if(!added) {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possivel adicionar a matéria para o aluno",
                "Erro!",
                JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        
        JOptionPane.showMessageDialog(
            null,
            "Matéria adicionada ao aluno com sucesso!",
            "Sucesso!",
            JOptionPane.INFORMATION_MESSAGE);
        
        this.updateDropdown();
    }//GEN-LAST:event_add_subject_studentActionPerformed

    private void delete_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_studentActionPerformed
        Student student = (Student) student_dropdown.getSelectedItem();
        
        int option = JOptionPane.showConfirmDialog(
                null,
                "Deseja excluir o aluno " + student.getName() + " da base de dados?",
                "Tem certeza?",
                JOptionPane.YES_NO_OPTION);
        
        if (option == 1) return;
        
        boolean deleted = this.university.unregisterStudent(student.getRA());
               
        if(!deleted) {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possivel deletar o aluno",
                "Erro!",
                JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        
        JOptionPane.showMessageDialog(
            null,
            "Aluno removido com sucesso!",
            "Sucesso!",
            JOptionPane.INFORMATION_MESSAGE);
        
        this.updateDropdown();
    }//GEN-LAST:event_delete_studentActionPerformed

    private void register_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_studentActionPerformed
        String name = student_name.getText();
        String lastName = student_lastname.getText();
        String password = String.valueOf(student_password.getPassword());

        if (name.isBlank() || lastName.isBlank() || password.isBlank()) {
            JOptionPane.showMessageDialog(
                null,
                "Preencha todos os campos para cadastrar um aluno",
                "Erro!",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        Student student = this.university.registerStudent(name, lastName, password, 1);

        if (student == null) {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possivel registrar o aluno",
                "Erro!",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(
            null,
            "Aluno cadastrado com sucesso!",
            "Sucesso!",
            JOptionPane.INFORMATION_MESSAGE);

        student_name.setText("");
        student_lastname.setText("");
        student_password.setText("");
        
        this.updateDropdown();
    }//GEN-LAST:event_register_studentActionPerformed

    private void student_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_lastnameActionPerformed

    private void show_students_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_students_subjectActionPerformed
        Subject subject = (Subject) subject_dropdown.getSelectedItem();
        
        results_label.setText("MOSTRANDO ALUNOS DA DISCIPLINA " + subject.getName());
        
        List<Student> students = this.university.getStudents(subject.getName());
        
        results.setText("");
        
        if (students == null || students.isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Nenhum aluno encontrado para a disciplina selecionada",
                "Atenção!",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for (Student s : students) {
            results.append(s + "\n");
        }
    }//GEN-LAST:event_show_students_subjectActionPerformed

    private void show_student_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_student_historyActionPerformed
        Student student = (Student) student_dropdown.getSelectedItem();
        
        results_label.setText("MOSTRANDO HISTÓRICO DE " + student.getName());
        
        List<Subject> subjects = this.university.getStudentSubjects(student, false);
        
        results.setText("");
        
        if (subjects == null || subjects.isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Nenhuma matéria encontrada para o aluno selecionado",
                "Atenção!",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
                
        for (Subject s : subjects) {
            results.append(s + " - Semestre: " + s.getSemester() + " - Nota: " + s.getGrade() + "\n");
        }
    }//GEN-LAST:event_show_student_historyActionPerformed

    private void show_student_subjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_student_subjectsActionPerformed
        Student student = (Student) student_dropdown.getSelectedItem();
        
        results_label.setText("MOSTRANDO DISCIPLINAS ATUAIS DE " + student.getName());
        
        List<Subject> subjects = this.university.getStudentSubjects(student, true);
        
        results.setText("");
        
        if (subjects == null || subjects.isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Nenhuma matéria que está sendo cursada no semestre atual foi encontrada para o aluno selecionado",
                "Atenção!",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (Subject s : subjects) {
            results.append(s + " - Nota: " + s.getGrade() + "\n");
        }
    }//GEN-LAST:event_show_student_subjectsActionPerformed

    private void add_gradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_gradesActionPerformed
        Subject subject = (Subject) student_subject_dropdown.getSelectedItem();
        Student student = (Student) student_dropdown.getSelectedItem();
        
        String grade = JOptionPane.showInputDialog(
                null,
                "Digite a nota de " + subject.getName() + " do aluno " + student.getName() + ":",
                "Inserir Nota",
                JOptionPane.QUESTION_MESSAGE);
        
        if (grade == null) return;
        
        subject.setGrade(Float.parseFloat(grade));
        
        boolean added = this.university.setStudentGrades(subject);
        
        if (!added) {  
            JOptionPane.showMessageDialog(
                null,
                "Não foi possivel adicionar a nota ao aluno",
                "Erro!",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(
            null,
            "Nota cadastrada com sucesso!",
            "Sucesso!",
            JOptionPane.INFORMATION_MESSAGE);
        
        this.updateDropdown();
    }//GEN-LAST:event_add_gradesActionPerformed

    private void finish_semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish_semesterActionPerformed
        boolean finished = this.university.finishSemester();
        
        if (!finished) {
            JOptionPane.showMessageDialog(
                null,
                "Não foi possivel finalizar o semestre",
                "Erro!",
                JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        
        JOptionPane.showMessageDialog(
            null,
            "Semestre finalizado com sucesso! Todos os alunos da universidade foram atualizados",
            "Sucesso!",
            JOptionPane.INFORMATION_MESSAGE);
        
        this.updateDropdown();
    }//GEN-LAST:event_finish_semesterActionPerformed

    private void student_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_dropdownActionPerformed

        if (student_dropdown.getSelectedIndex() == -1) {
            student_subject_dropdown.setModel(new DefaultComboBoxModel());
            student_subject_dropdown.setEnabled(false);
            
            delete_student.setEnabled(false);
            show_student_history.setEnabled(false);
            show_student_subjects.setEnabled(false);
            add_grades.setEnabled(false);
            
            add_subject_student.setEnabled(false);
            
            return;
        }
        
        Student student = (Student) student_dropdown.getSelectedItem();
        
        List<Subject> subjects = this.university.getStudentSubjects(student, true);
        
        student_subject_dropdown.setModel(new DefaultComboBoxModel(subjects.toArray()));
        student_subject_dropdown.setSelectedIndex(-1);
        student_subject_dropdown.setEnabled(true);
        
        if (subject_dropdown.getSelectedIndex() != -1) add_subject_student.setEnabled(true);
        
        delete_student.setEnabled(true);
        show_student_history.setEnabled(true);
        show_student_subjects.setEnabled(true);
    }//GEN-LAST:event_student_dropdownActionPerformed

    private void student_subject_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_subject_dropdownActionPerformed
        if (student_subject_dropdown.getSelectedIndex() == -1) {
            add_grades.setEnabled(false);
            
            return;
        }
        
        add_grades.setEnabled(true);
    }//GEN-LAST:event_student_subject_dropdownActionPerformed

    private void subject_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject_dropdownActionPerformed
        if (subject_dropdown.getSelectedIndex() == -1) {
            
            show_students_subject.setEnabled(false);
            
            add_subject_student.setEnabled(false);
            
            return;
        }
        
        if (student_dropdown.getSelectedIndex() != -1) add_subject_student.setEnabled(true);
        
        show_students_subject.setEnabled(true);    
    }//GEN-LAST:event_subject_dropdownActionPerformed

    private void updateDropdown() {
        List<Student> students = this.university.getStudents();
        List<Subject> subjects = this.university.getAllDistinctSubjects();
        
        student_dropdown.setModel(new DefaultComboBoxModel(students.toArray()));
        subject_dropdown.setModel(new DefaultComboBoxModel(subjects.toArray()));
        
        student_dropdown.setSelectedIndex(-1);
        subject_dropdown.setSelectedIndex(-1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_grades;
    private javax.swing.JButton add_subject_student;
    private javax.swing.JButton delete_student;
    private javax.swing.JButton finish_semester;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton register_student;
    private javax.swing.JButton register_subject;
    private javax.swing.JTextArea results;
    private javax.swing.JLabel results_label;
    private javax.swing.JButton show_student_history;
    private javax.swing.JButton show_student_subjects;
    private javax.swing.JButton show_students_subject;
    private javax.swing.JComboBox<String> student_dropdown;
    private javax.swing.JTextField student_lastname;
    private javax.swing.JTextField student_name;
    private javax.swing.JPasswordField student_password;
    private javax.swing.JComboBox<String> student_subject_dropdown;
    private javax.swing.JComboBox<String> subject_dropdown;
    private javax.swing.JTextField subject_name;
    // End of variables declaration//GEN-END:variables
}
