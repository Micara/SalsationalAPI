# Salsational API

# What is this?

This library enables you to compose dance sequences and validate those sequences against a CFG. It allows the user to create Move and Sequence files which can be used in the Salsational graphics application, to display those sequences.


## High-level Design

* An element is a primitive unit for a specific dance style
* A line object comprises one or several elements
* A move object consists of a collection of lines
* A sequence is made by concatenating move objects

