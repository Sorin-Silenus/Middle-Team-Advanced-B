from datetime import datetime

# Initialize date string
date_str = "2022-03-17 10:45:30"
# Initialize date object
#bug fixed added t to datetime
#bug fixed added comma
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S')
# Format date
#bug fixed added comma
formatted_date = date.strftime('%m/%d/%Y %H:%M:%S')

# Print Formatted date
#added print
print(formatted_date)
