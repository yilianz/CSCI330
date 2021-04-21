
# Stack.rb - defines and tests a stack of maximum length
#             100, implemented in an array
class  StackClass
    # Constructor
      def initialize
        @stackRef = Array.new(100)
        @maxLen = 100
        @topIndex = -1
      end 
    # push method
       def push(number)
         if @topIndex == @maxLen
           puts "Error in push - stack is full"
         else
           @topIndex = @topIndex + 1
           @stackRef[@topIndex] = number
          end
          end 
    # pop method
      def pop
         if empty
           puts "Error in pop - stack is empty"
         else
           @topIndex = @topIndex - 1
         end
       end
    # top method
       def top
         if empty
           puts "Error in top - stack is empty"
         else
           @stackRef[@topIndex]
         end
       end 
    # empty method
      def empty
        @topIndex == -1
      end
    end
    
    
    myStack = StackClass.new
    myStack.push(42)
    myStack.push(29)
    puts "Top element is :#{myStack.top}"
    myStack.pop
    puts "Top element is #{myStack.top}"
    myStack.pop
    
    class StackClass
      def sayhi
        puts "hello in the new method sayhi"
      end
    end
    
    myStack.sayhi  # well defined
    puts "Top element is (should be 42): #{myStack.top}"

    