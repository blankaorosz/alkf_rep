///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package hu.elte.alkfejl.controller;
//
//import hu.elte.alkfejl.entity.Order;
//import hu.elte.alkfejl.repository.OrderRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
///**
// *
// * @author Blanka Orosz
// */
//@Controller
//public class OrderController {
//    @Autowired
//    private OrderRepository orderRepository;
//    
//    @GetMapping("/order")
//    public String getOrders(Model model) {
//        Iterable<Order> t = orderRepository.findAll();
//        Order newOrder = new Order();
//        model.addAttribute("orders", t);
//        model.addAttribute("newOrder", newOrder);
//        return "todo";
//    }
//    
//    @PostMapping("/addOrder")
//    public String addTodo(@ModelAttribute Order order) {
//        orderRepository.save(order);
//        return "redirect:/order";
//    }
//}
