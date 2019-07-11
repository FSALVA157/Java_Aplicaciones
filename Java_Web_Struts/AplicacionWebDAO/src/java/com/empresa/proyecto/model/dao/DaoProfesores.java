
package com.empresa.proyecto.model.dao;

import com.empresa.proyecto.dto.Profesores;
import java.util.List;


public interface DaoProfesores {
    public List<Profesores> profesoresQry();
    
    public String profesoresIns(Profesores profesores);
    
    public String profesoresDel(String ids);
    
    public Profesores profesoresGet(Integer idprofesor);
    
    public String profesoresUpd(Profesores profesores);
}
