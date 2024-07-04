defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  describe "percentage_grade/1" do
    test "sample" do
      assert 85 ==
               Calculator.percentage_grade(%{
                 homework: [0.8],
                 labs: [1, 1, 1],
                 midterm: 0.70,
                 final: 0.9
               })
    end
  end

  test "TC1" do
    grades = %{homework: [], labs: [], midterm: 0.0, final: 0.0}
    assert Calculator.percentage_grade(grades) == 0
    assert Calculator.letter_grade(grades) == "EIN"
    assert Calculator.numeric_grade(grades) == 0
  end

  test "TC2" do
    grades = %{homework: [0.3], labs: [0.3], midterm: 0.3, final: 0.3}
    assert Calculator.percentage_grade(grades) == 30
    assert Calculator.letter_grade(grades) == "EIN"
    assert Calculator.numeric_grade(grades) == 0
  end

  test "TC3" do
    grades = %{homework: [0.5], labs: [0.3, 0.3, 0.3], midterm: 0.3, final: 0.3}
    assert Calculator.percentage_grade(grades) == 36
    assert Calculator.letter_grade(grades) == "EIN"
    assert Calculator.numeric_grade(grades) == 0
  end

  test "TC4" do
    grades = %{homework: [0.5], labs: [0.3, 0.3], midterm: 0.5, final: 0.5}
    assert Calculator.percentage_grade(grades) == 46
    assert Calculator.letter_grade(grades) == "EIN"
    assert Calculator.numeric_grade(grades) == 0
  end

  test "TC5" do
    grades = %{homework: [0.5], labs: [0.5, 0.5, 0.5], midterm: 0.5, final: 0.5}
    assert Calculator.percentage_grade(grades) == 50
    assert Calculator.letter_grade(grades) == "D"
    assert Calculator.numeric_grade(grades) == 2
  end
end
