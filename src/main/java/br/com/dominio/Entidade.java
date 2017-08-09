//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2017.08.08 �s 09:50:42 PM BRT 
//


package br.com.dominio;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de entidade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="entidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pacientes" type="{}pacientes"/>
 *         &lt;element name="medicos" type="{}medicos" minOccurs="0"/>
 *         &lt;element name="solicitacao" type="{}solicitacao" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="codigo" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="chave" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="16"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entidade", propOrder = {
    "pacientes",
    "medicos",
    "solicitacao"
})
public class Entidade {

    @XmlElement(required = true)
    protected Pacientes pacientes;
    protected Medicos medicos;
    @XmlElement(required = true)
    protected List<Solicitacao> solicitacao;
    @XmlAttribute(name = "codigo", required = true)
    protected BigInteger codigo;
    @XmlAttribute(name = "chave", required = true)
    protected String chave;

    /**
     * Obt�m o valor da propriedade pacientes.
     * 
     * @return
     *     possible object is
     *     {@link Pacientes }
     *     
     */
    public Pacientes getPacientes() {
        return pacientes;
    }

    /**
     * Define o valor da propriedade pacientes.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacientes }
     *     
     */
    public void setPacientes(Pacientes value) {
        this.pacientes = value;
    }

    /**
     * Obt�m o valor da propriedade medicos.
     * 
     * @return
     *     possible object is
     *     {@link Medicos }
     *     
     */
    public Medicos getMedicos() {
        return medicos;
    }

    /**
     * Define o valor da propriedade medicos.
     * 
     * @param value
     *     allowed object is
     *     {@link Medicos }
     *     
     */
    public void setMedicos(Medicos value) {
        this.medicos = value;
    }

    /**
     * Gets the value of the solicitacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Solicitacao }
     * 
     * 
     */
    public List<Solicitacao> getSolicitacao() {
        if (solicitacao == null) {
            solicitacao = new ArrayList<Solicitacao>();
        }
        return this.solicitacao;
    }

    /**
     * Obt�m o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigo(BigInteger value) {
        this.codigo = value;
    }

    /**
     * Obt�m o valor da propriedade chave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChave() {
        return chave;
    }

    /**
     * Define o valor da propriedade chave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChave(String value) {
        this.chave = value;
    }

}
