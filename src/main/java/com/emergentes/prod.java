
package com.emergentes;

public class prod {
    private String producto;
    private String categoria;
    private String existencia;
    private String precio;

    public prod() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String Existencia) {
        this.existencia = Existencia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "prod{" + "producto=" + producto + ", categoria=" + categoria + ", Existencia=" + existencia + ", precio=" + precio + '}';
    }
    
    
}
