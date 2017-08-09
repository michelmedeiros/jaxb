//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.08.08 às 09:50:42 PM BRT 
//


package br.com.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de solicitacoes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitacoes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{}entidade" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="datahora">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-3][0-9]/[01][0-9]/[0-9]{4} [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="operador" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacoes", propOrder = {
    "entidade"
})
public class Solicitacoes {

    @XmlElement(required = true)
    protected List<Entidade> entidade;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "datahora")
    protected String datahora;
    @XmlAttribute(name = "operador")
    protected String operador;
    @XmlAttribute(name = "lis")
    protected String lis;

    /**
     * Gets the value of the entidade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entidade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntidade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entidade }
     * 
     * 
     */
    public List<Entidade> getEntidade() {
        if (entidade == null) {
            entidade = new ArrayList<Entidade>();
        }
        return this.entidade;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Obtém o valor da propriedade datahora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatahora() {
        return datahora;
    }

    /**
     * Define o valor da propriedade datahora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatahora(String value) {
        this.datahora = value;
    }

    /**
     * Obtém o valor da propriedade operador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperador() {
        return operador;
    }

    /**
     * Define o valor da propriedade operador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperador(String value) {
        this.operador = value;
    }

    /**
     * Obtém o valor da propriedade lis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLis() {
        return lis;
    }

    /**
     * Define o valor da propriedade lis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLis(String value) {
        this.lis = value;
    }

}
