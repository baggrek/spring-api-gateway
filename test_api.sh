API_ENDPOINT="http://localhost:8085/api/user/user"

for ((i=1; i<=7; i++)); do
    echo "Request $i:"
    response=$(curl -s -w "Status Code: %{http_code}\nResponse Body: %{response_body}\n" -X GET $API_ENDPOINT)
    echo "$response"
    echo "--------------------------"
done