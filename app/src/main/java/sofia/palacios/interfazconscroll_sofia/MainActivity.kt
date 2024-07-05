package sofia.palacios.interfazconscroll_sofia

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Lamar variables
        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtApellido = findViewById<TextView>(R.id.txtApellido)
        val txtEdad = findViewById<TextView>(R.id.txtEdad)
        val txtProfesion = findViewById<TextView>(R.id.txtProfesion)
        val txtNumTarjeta = findViewById<TextView>(R.id.txtNumTarjeta)
        val txtTipoSangre = findViewById<TextView>(R.id.txtTipoSangre)
        val txtDireccion = findViewById<TextView>(R.id.txtDireccion)
        val txtEstadoCivil = findViewById<TextView>(R.id.txtEstadoCivil)
        val txtPeso = findViewById<TextView>(R.id.txtPeso)
        val txtTelefono = findViewById<TextView>(R.id.txtTelefono)
        val txtNacionalidad = findViewById<TextView>(R.id.txtNacionalidad)
        val txtAltura = findViewById<TextView>(R.id.txtAltura)
        val txtDUI = findViewById<TextView>(R.id.txtDUI)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener{

            //Inicializar
            val Nombre = txtNombre.text.toString()
            val Apellido = txtApellido.text.toString()
            val Edad = txtEdad.text.toString()
            val Profesion = txtProfesion.text.toString()
            val NumTarjeta = txtNumTarjeta.text.toString()
            val TipoSangre = txtTipoSangre.text.toString()
            val Direccion = txtDireccion.text.toString()
            val EstadoCivil = txtEstadoCivil.text.toString()
            val Peso = txtPeso.text.toString()
            val Telefono = txtTelefono.text.toString()
            val Nacionalidad = txtNacionalidad.text.toString()
            val Altura = txtAltura.text.toString()
            val DUI = txtDUI.text.toString()

            var HayErrores = false

            if (Nombre.isEmpty()) {
                txtNombre.error = "El nombre es obligatorio"
                HayErrores = true
            } else {
                txtNombre.error = null
            }

            if (Apellido.isEmpty()) {
                txtApellido.error = "El apellido es obligatorio"
                HayErrores = true
            } else {
                txtNombre.error = null
            }

            if (Edad.isEmpty()) {
                txtEdad.error = "La edad es obligatoria"
                HayErrores = true
            } else {
                txtEdad.error = null
            }


            if (Profesion.isEmpty()) {
                txtProfesion.error = "La profesión es obligatoria"
                HayErrores = true
            } else {
                txtProfesion.error = null
            }

            if (NumTarjeta.isEmpty()) {
                txtNumTarjeta.error = "El número de tarjeta es obligatorio"
                HayErrores = true
            } else {
                txtNumTarjeta.error = null
            }

            if (TipoSangre.isEmpty()) {
                txtTipoSangre.error = "El tipo de sangre es obligatorio"
                HayErrores = true
            } else {
                txtTipoSangre.error = null
            }

            if (Direccion.isEmpty()) {
                txtDireccion.error = "La dirección es obligatoria"
                HayErrores = true
            } else {
                txtDireccion.error = null
            }

            if (EstadoCivil.isEmpty()) {
                txtEstadoCivil.error = "El estado civil es obligatorio"
                HayErrores = true
            } else {
                txtEstadoCivil.error = null
            }

            if (Telefono.isEmpty()) {
                txtTelefono.error = "El teléfono es obligatorio"
                HayErrores = true
            } else {
                txtTelefono.error = null
            }

            if (Peso.isEmpty()) {
                txtPeso.error = "El peso es obligatorio"
                HayErrores = true
            } else {
                txtPeso.error = null
            }

            if (Direccion.isEmpty()) {
                txtDireccion.error = "La dirección es obligatoria"
                HayErrores = true
            } else {
                txtDireccion.error = null
            }

            if (Nacionalidad.isEmpty()) {
                txtNacionalidad.error = "La nacionalida es obligatoria"
                HayErrores = true
            } else {
                txtNacionalidad.error = null
            }

            if (Altura.isEmpty()) {
                txtAltura.error = "La altura es obligatoria"
                HayErrores = true
            } else {
                txtAltura.error = null
            }

            if (DUI.isEmpty()) {
                txtDUI.error = "El DUI es obligatorio"
                HayErrores = true
            } else {
                txtDUI.error = null
            }

            //Validaciones

            if (!Edad.matches(Regex("[0-9]+"))){
                txtEdad.error = "La edad debe contener solo números"
                HayErrores = true
            }

            if (!DUI.matches(Regex("[0-9]{8}-[0-9]"))) {
                txtDUI.error = "El Dui debe cumplir el formato Ej: 12345678-9"
                HayErrores = true
            } else {
                txtDUI.error = null
            }

        }

        //Hola Prueba



    }
}