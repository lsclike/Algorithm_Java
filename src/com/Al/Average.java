package com.Al;


    /**
     *  The {@code Average} class provides a client for reading in a sequence
     *  of real numbers and printing out their average.
     *  <*  For additional documentation, see <a href="https://algs4.cs.princeton.edu/11model">Section 1.1</a> of
     *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
     *
     *  @author Robert Sedgewick
     *  @author Kevin Wayne
     */
    public class Average {

        // this class should not be instantiated
        private Average() { }

        /**
         * Reads in a sequence of real numbers from standard input and prints
         * out their average to standard output.
         *
         * @param args the command-line arguments
         */
        public static void main(String[] args) {
            int count = 0;       // number input values
            double sum = 0.0;    // sum of input values

            // read data and compute statistics
            while (!StdIn.isEmpty()) {
                double value = StdIn.readDouble();
                sum += value;
                count++;
            }

            // compute the average
            double average = sum / count;

            // print results
            StdOut.println("Average is " + average);
        }
    }

