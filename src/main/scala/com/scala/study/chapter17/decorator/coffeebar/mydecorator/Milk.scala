package com.scala.study.chapter17.decorator.coffeebar.mydecorator

import com.scala.study.chapter17.decorator.coffeebar.Drink


class Milk(obj: Drink) extends Decorator(obj) {

  setDescription("Milk")
  setPrice(2.0f)
}
