//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.08.08 às 09:50:42 PM BRT 
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
 * <p>Classe Java de amostra complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="amostra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exame" type="{}exame" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="identificacao">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="14"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="descricao">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="material" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="seqimpressao" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amostra", propOrder = {
    "exame"
})
public class Amostra {

    @XmlElement(required = true)
    protected List<Exame> exame;
    @XmlAttribute(name = "identificacao")
    protected String identificacao;
    @XmlAttribute(name = "descricao")
    protected String descricao;
    @XmlAttribute(name = "material")
    protected BigInteger material;
    @XmlAttribute(name = "seqimpressao")
    protected String seqimpressao;

    /**
     * Gets the value of the exame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exame }
     * 
     * 
     */
    public List<Exame> getExame() {
        if (exame == null) {
            exame = new ArrayList<Exame>();
        }
        return this.exame;
    }

    /**
     * Obtém o valor da propriedade identificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacao() {
        return identificacao;
    }

    /**
     * Define o valor da propriedade identificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacao(String value) {
        this.identificacao = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade material.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaterial() {
        return material;
    }

    /**
     * Define o valor da propriedade material.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaterial(BigInteger value) {
        this.material = value;
    }

    /**
     * Obtém o valor da propriedade seqimpressao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqimpressao() {
        return seqimpressao;
    }

    /**
     * Define o valor da propriedade seqimpressao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqimpressao(String value) {
        this.seqimpressao = value;
    }

}
