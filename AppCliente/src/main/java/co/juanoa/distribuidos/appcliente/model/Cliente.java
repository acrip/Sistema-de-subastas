package co.juanoa.distribuidos.appcliente.model;

public class Cliente {
    private Integer id;		
    private String nombre;	
    private String apellido;	
    private String email;	  
    private Integer telefono;		
    private String usuario;	
    private String contraseña;	

    public Cliente(){}
    public Cliente(Integer id, String nombre, String apellido, String email, Integer telefono, String usuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Integer getId() {
            return id;
    }
    public void setId(Integer id) {
            this.id = id;
    }
    public String getNombre() {
            return nombre;
    }
    public void setNombre(String nombre) {
            this.nombre = nombre;
    }
    public String getApellido() {
            return apellido;
    }
    public void setApellido(String apellido) {
            this.apellido = apellido;
    }
    public String getEmail() {
            return email;
    }
    public void setEmail(String email) {
            this.email = email;
    }
    public Integer getTelefono() {
            return telefono;
    }
    public void setTelefono(Integer telefono) {
            this.telefono = telefono;
    }
    public String getUsuario() {
            return usuario;
    }
    public void setUsuario(String usuario) {
            this.usuario = usuario;
    }
    public String getContraseña() {
            return contraseña;
    }
    public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
    }
}
