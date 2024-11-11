Python 3.13.0 (tags/v3.13.0:60403a5, Oct  7 2024, 09:38:07) [MSC v.1941 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> import unittest
... from calculator import Calculator
... 
... class TestCalculator(unittest.TestCase):
... 
...     def setUp(self):
...         self.calc = Calculator()
... 
...     def test_add(self):
...         self.assertEqual(self.calc.add(1, 2), 3)
...         self.assertEqual(self.calc.add(-1, 1), 0)
... 
...     def test_subtract(self):
...         self.assertEqual(self.calc.subtract(5, 3), 2)
...         self.assertEqual(self.calc.subtract(0, 5), -5)
... 
...     def test_multiply(self):
...         self.assertEqual(self.calc.multiply(4, 3), 12)
...         self.assertEqual(self.calc.multiply(-1, 5), -5)
... 
...     def test_divide(self):
...         self.assertEqual(self.calc.divide(10, 2), 5)
...         self.assertEqual(self.calc.divide(-10, 2), -5)
... 
...     def test_divide_by_zero(self):
...         with self.assertRaises(ValueError):
...             self.calc.divide(10, 0)
... 
...     def test_chain_operations(self):
...         result = self.calc.add(self.calc.multiply(2, 3), self.calc.divide(10, 2))
...         self.assertEqual(result, 11)
... 
...     def test_operation_types(self):
...         result_add = self.calc.add(1.5, 2.5)
...         result_subtract = self.calc.subtract(5, 3.5)
...         self.assertEqual(result_add, 4.0)
        self.assertEqual(result_subtract, 1.5)

    def test_large_numbers(self):
        self.assertEqual(self.calc.multiply(1000000, 1000000), 1000000000000)

    def test_negative_numbers(self):
        self.assertEqual(self.calc.add(-5, -7), -12)
        self.assertEqual(self.calc.multiply(-2, -3), 6)

    def test_float_division(self):
        self.assertAlmostEqual(self.calc.divide(7, 3), 2.333333333, places=7)

if __name__ == "__main__":
    unittest.main()
