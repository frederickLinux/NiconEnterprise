/**
 * CopyRigth (C) 2013 NiconSystem Incorporated. 
 * 
 * NiconSystem Inc.
 * Cll 9a#6a-09 Florida Valle del cauca Colombia
 * 318 437 4382
 * fredefass01@gmail.com
 * desarrollador-mantenedor: Frederick Adolfo Salazar Sanchez.
 */

package nicon.enterprise.libCore.api.obj;

/**
 * el objeto <b> Cliente </b> representa la existencia de un cliente fisico
 * de la empresa y almacena la informacion basica personal y de contacto de
 * un cliente de la empresa, este cliente podrá inciar operaciones con el 
 * resto del sistema como ventas, actividades etc.
 * 
 * @author Frederick Adolfo Salazar Sanchez
 */
public class Cliente {

    private String identificacion;
    private String nombres;
    private String apellidos;
    private String ciudad;
    private String direccion;
    private String provincia;
    private String telefonoFijo;
    private String telefonoMovil;
    private String telefonoAlternativo;
    private String Email;
    private String fechaRegistro;
    private int codigoAlmacen;

    /**
     * 
     * @param identificacion
     * @param nombres
     * @param apellidos
     * @param ciudad
     * @param direccion
     * @param provincia
     * @param Telefono_fijo
     * @param Telefono_movil
     * @param Telefono_alternativo
     * @param Email
     * @param Code_Store 
     */
    public Cliente(String identificacion, String nombres, String apellidos, String ciudad, String direccion, String provincia, String Telefono_fijo, String Telefono_movil, String Telefono_alternativo, String Email, int Code_Store) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.provincia = provincia;
        this.telefonoFijo = Telefono_fijo;
        this.telefonoMovil = Telefono_movil;
        this.telefonoAlternativo = Telefono_alternativo;
        this.Email = Email;
        this.codigoAlmacen = Code_Store;
    }

    /**
     * 
     * @param identificacion
     * @param nombres
     * @param apellidos
     * @param ciudad
     * @param direccion
     * @param provincia
     * @param telefono_fijo
     * @param telefono_movil
     * @param telefono_alternativo
     * @param email
     * @param fecha_registro
     * @param Codigo_almacen 
     */
    public Cliente(String identificacion, String nombres, String apellidos, String ciudad, String direccion, String provincia, String telefono_fijo, String telefono_movil, String telefono_alternativo, String email, String fecha_registro, int Codigo_almacen) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.provincia = provincia;
        this.telefonoFijo = telefono_fijo;
        this.telefonoMovil = telefono_movil;
        this.telefonoAlternativo = telefono_alternativo;
        this.Email = email;
        this.fechaRegistro = fecha_registro;
        this.codigoAlmacen = Codigo_almacen;
    }

    /**
     * 
     */
    public Cliente() {
    }

    public String getFecha_registro() {
        return this.fechaRegistro;
    }

    public int getCodigoAlmacen() {
        return this.codigoAlmacen;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getTelefono_alternativo() {
        return this.telefonoAlternativo;
    }

    public String getTelefono_fijo() {
        return this.telefonoFijo;
    }

    public String getTelefono_movil() {
        return this.telefonoMovil;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public String getNombres() {
        return this.nombres;
    }

    public String getProvincia() {
        return this.provincia;
    }

    @Override
    public String toString() {
        return identificacion + "  " + nombres + "  " + apellidos + "  " + ciudad + "   " +direccion + "  " + telefonoMovil + "  " + telefonoAlternativo;
    }
}
