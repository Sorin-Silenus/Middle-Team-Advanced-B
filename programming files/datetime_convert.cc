#include <iostream>
#include <iomanip>
#include <sstream>
#include <chrono>

int main()
{
    // Initialize date_str with date and time
    string date_str = "2022-03-17 10:45:30";

    // Create structure to hold date
    std::tm date_obj = {};

    // Create input stream for parsing
    std::istringstream ss(date_str);

    // Call get_time on date
    ss = std::get_time(&date_obj, "%Y-%m-%d %H:%M:%S");

    // Format string
    std::stringstream formatted_date_ss;
    formatted_date_ss << std::put_time(&date_obj, "%m/%d/%Y %H:%M:%S");
    std::string formatted_date = formatted_date_ss.str();

    // Output formatted date
    std::cout << formatted_date << std::endl;

    return 0
