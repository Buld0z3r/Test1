Python 3.13.0 (tags/v3.13.0:60403a5, Oct  7 2024, 09:38:07) [MSC v.1941 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> class Calculator:
...     def add(self, a, b):
...         return a + b
... 
...     def subtract(self, a, b):
...         return a - b
... 
...     def multiply(self, a, b):
...         return a * b
... 
...     def divide(self, a, b):
...         if b == 0:
...             raise ValueError("Cannot divide by zero")
...         return a / b
