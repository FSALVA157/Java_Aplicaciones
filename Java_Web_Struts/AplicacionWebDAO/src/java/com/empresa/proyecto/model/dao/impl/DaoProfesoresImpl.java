package com.empresa.proyecto.model.dao.impl;

import com.empresa.proyecto.dto.Profesores;
import com.empresa.proyecto.model.dao.DaoProfesores;
import com.empresa.proyecto.sql.SqlConecta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoProfesoresImpl implements DaoProfesores {

    private SqlConecta conecta;

    public DaoProfesoresImpl() {
        this.conecta = new SqlConecta();
    }

    @Override
    public List<Profesores> profesoresQry() {
        List<Profesores> list = null;
        Connection cn = conecta.connection();
        String sql = "SELECT"
                + "idprofesor,"
                + "appaterno,"
                + "apmaterno,"
                + "nombres,"
                + "nacimiento,"
                + "direccion,"
                + "referencia,"
                + "IF(genero LIKE '1','M','F'),"
                + "IF(estado LIKE '1','Si','No'),"
                + "FROM profesores "
                + "ORDER BY appaterno,apmaterno,nombres";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            list = new ArrayList<Profesores>();

            while (rs.next()) {
                Profesores p = new Profesores();

                p.setIdprofesor(rs.getInt(1));
                p.setAppaterno(rs.getString(2));
                p.setApmaterno(rs.getNString(3));
                p.setNombres(rs.getString(4));
                p.setNacimiento(rs.getDate(5));
                p.setDireccion(rs.getString(6));
                p.setReferencia(rs.getString(7));
                p.setGenero(rs.getString(8));
                p.setEstado(rs.getString(9));

                list.add(p);
            }

        } catch (SQLException e) {
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DaoProfesoresImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;

    }

    @Override
    public String profesoresIns(Profesores profesores) {
        String result = null;
        Connection cn = conecta.connection();
        String sql = "INSERT INTO profesores ("
                + "appaterno,"
                + "apmaterno,"
                + "nombres,"
                + "nacimiento,"
                + "direccion,"
                + "referencia,"
                + "genero,"
                + "estado"
                + ") VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, profesores.getAppaterno());
            ps.setString(2, profesores.getApmaterno());
            ps.setString(3, profesores.getNombres());
            ps.setDate(4, profesores.getNacimiento());
            ps.setString(5, profesores.getDireccion());
            ps.setString(6, profesores.getReferencia());
            ps.setString(7, profesores.getGenero());
            ps.setString(8, profesores.getEstado());

            int ctos = ps.executeUpdate();
            if (ctos == 0) {
                result = "0 filas afectadas";
            }

        } catch (SQLException e) {
            result = e.getMessage();
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                result = e.getMessage();
            }
        }

        return result;

    }

    @Override
    public String profesoresDel(String ids) {
        String result = null;
        Connection cn = conecta.connection();
        String sql = "DELETE * from profesores"
                + "WHERE idprofesor = " + ids;

        try {
            Statement st = cn.createStatement();
            int ctos = st.executeUpdate(sql);
            if (ctos == 0) {
                result = "0 filas afectadas";
            }

        } catch (SQLException e) {
            result = e.getMessage();
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                result = e.getMessage();
            }
        }
        return result;
    }

    @Override
    public Profesores profesoresGet(Integer idprofesor) {
        Profesores p = null;
        Connection cn = conecta.connection();
        String sql = "SELECT  "
                + "idprofesor,"
                + "appaterno,"
                + "apmaterno,"
                + "nombres,"
                + "nacimiento,"
                + "direccion,"
                + "referencia,"
                + "genero,"
                + "estado "
                + "FROM profesores "
                + "WHERE idprofesor = ?";

        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, idprofesor);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                p = new Profesores();

                p.setIdprofesor(rs.getInt(1));
                p.setAppaterno(rs.getString(2));
                p.setApmaterno(rs.getString(3));
                p.setNombres(rs.getString(4));
                p.setNacimiento(rs.getDate(5));
                p.setDireccion(rs.getString(6));
                p.setReferencia(rs.getString(7));
                p.setGenero(rs.getString(8));
                p.setEstado(rs.getString(9));

            }

        } catch (SQLException e) {
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
            }
        }
        return p;
    }

    @Override
    public String profesoresUpd(Profesores profesores) {
        Connection cn = conecta.connection();
        String result = null;
        String sql = "UPDATE profesores SET"
                + "appaterno=?,"
                + "apmaterno=?,"
                + "nombres=?,"
                + "nacimiento=?,"
                + "direccion=?,"
                + "referencia=?,"
                + "genero=?,"
                + "estado=? "
                + "WHERE idprofesor =?";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, profesores.getAppaterno());
            ps.setString(2, profesores.getApmaterno());
            ps.setString(3, profesores.getNombres());
            ps.setDate(4, profesores.getNacimiento());
            ps.setString(5, profesores.getDireccion());
            ps.setString(6, profesores.getReferencia());
            ps.setString(7, profesores.getGenero());
            ps.setString(8, profesores.getEstado());
            ps.setInt(9, profesores.getIdprofesor());
            
            int ctos = ps.executeUpdate();
            if(ctos == 0){
                 result = "0 filas afectadas";
            }
            
            
       } catch (SQLException e) {
            result = e.getMessage();
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                result = e.getMessage();
            }
        }

        return result;

    }

}
