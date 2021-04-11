package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	  private float a;
	  private float b;
	  
	  public Calculadora() {
		  }
	  public float sumarDosnumeros() {
		  float suma;
		  suma = a + b;
		  return suma;
		  
	  }
	  public float restaDosNumeros() {
		  float resta;
		  resta = a - b;
		  return resta;
	  }
	  public float multiplicarDosNumeros() {
		  float multiplicacion;
		  multiplicacion = a*b;
		  return multiplicacion;
	  }
	  public float dividirDosnumeros() {
		  
	  float division;
	  division=0;
	  if(b==0) {
		  System.out.println("No se puede dividir por 0");
	  }
	  else {
	  division=a/b;
	  
	  }
	  return division;
	  
	  }

	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	  
	  }
