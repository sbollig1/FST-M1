import pytest

num1 = 5
num2 = 5


def test_sum():
    assert 10 == num1+num2

def test_sub():
    assert 0 == num1-num2

def test_multi():
    assert 25 == num1*num2

def test_divi():
    assert 1 == num1/num2

