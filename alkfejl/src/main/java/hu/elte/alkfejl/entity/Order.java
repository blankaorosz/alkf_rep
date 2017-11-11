/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.alkfejl.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.springframework.format.annotation.DateTimeFormat;
/**
 *
 * @author Blanka Orosz
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Order extends BaseEntity{
    @Column
    private Integer amount;
    
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDate;
    
    @Column
    private Boolean status;

}
