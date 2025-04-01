from datetime import datetime

# Initialize date string
date_str = "2022-03-17 10:45:30"
# Initialize date object
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S')
# Format date
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S')

# Print Formatted date
print(formatted_date)
