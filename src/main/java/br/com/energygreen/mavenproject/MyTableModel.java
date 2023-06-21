/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.energygreen.mavenproject;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author vitoralmeida
 */
class MyTableModel extends DefaultTableModel {
        
        DefaultTableModel modelo;
        
        public MyTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }
        
        public MyTableModel(DefaultTableModel model) {
            modelo = model;
        }
        // Método de remoção personalizado
        public void removeRow(int row) {
            // Remove a linha do modelo
            modelo.removeRow(row);
        }
        
    }
