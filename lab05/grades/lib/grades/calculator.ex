defmodule Grades.Calculator do
  def avg(grades) do
    if Enum.count(grades) == 0 do
      0
    else
      Enum.sum(grades) / Enum.count(grades)
    end
  end
  
  def failed_to_participate(avg_homework, avg_exams, labs) do
    num_labs = num_labs_pass(labs)
    avg_homework < 0.4 || avg_exams < 0.4 || num_labs < 3
    end
    
  def calculate_mark(avg_labs, avg_homework, midterm, final) do
    0.2 * avg_labs + 0.3 * avg_homework + 0.2 * midterm + 0.3 * final
    end
    
  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework = avg(homework)
    avg_labs = avg(labs)
    mark = calculate_mark(avg_labs, avg_homework, midterm, final)
    round(mark * 100)
  end


  def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework = avg(homework)
    avg_labs = avg(labs)
    avg_exams = (midterm + final) / 2

    if failed_to_participate?(avg_homework, avg_exams, labs) do
      "EIN"
    else
      mark = calculate_mark(avg_labs, avg_homework, midterm, final)
      letter_mark=get_letter_mark(mark)
      letter_grade=get_letter_grade(letter_mark)


    end
  end



  def numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework = avg(homework)
    avg_labs = avg(labs)
    avg_exams = (midterm + final) / 2

    if failed_to_participate?(avg_homework, avg_exams, labs) do
      0
    else
      mark = calculate_mark(avg_labs, avg_homework, midterm, final)
      get_letter_mark(mark)
  end


end
