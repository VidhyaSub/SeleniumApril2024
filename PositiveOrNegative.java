����   1 M  week1/day2/PositiveOrNegative  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lweek1/day2/PositiveOrNegative; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Enter number: 
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextInt ()I , java/lang/StringBuilder . The number 
 + 0  &
 + 2 3 4 append (I)Ljava/lang/StringBuilder; 6  is a positive number
 + 8 3 9 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 + ; < = toString ()Ljava/lang/String;
 " ? @ & println B  is a negative number D The number is zero args [Ljava/lang/String; sc Ljava/util/Scanner; num I 
SourceFile PositiveOrNegative.java !               /     *� �    
                    	       �     e� Y� � L� � !+� '=� !� � +Y-� /� 15� 7� :� >� -� !� � +Y-� /� 1A� 7� :� >� � C� >�    
   .    	  
       7  :  >  Y  \  d          e E F    Z G H   M I J   K    L