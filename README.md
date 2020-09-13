![CI](https://github.com/teverett/hsopenapi/workflows/CI/badge.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/92734c5b095c44b48f95bf2d993cddb7)](https://app.codacy.com/manual/teverett/hsopenapi?utm_source=github.com&utm_medium=referral&utm_content=teverett/hsopenapi&utm_campaign=Badge_Grade_Dashboard)

# HomeSeer hsOpenAPI

A Java [OpenAPI](https://en.wikipedia.org/wiki/OpenAPI_Specification) bridge for HomeSeer. 

hsOpenAPI uses [hsClient](https://github.com/teverett/hsclient)

## License

hsOpenAPI is distributed under the BSD 3-Clause License.

## Configuration

hsOpenAPI is configured via the file "hsopenapi.properties".  A typical example is

```
# HomeSeer
hsurl=http://192.168.75.129/JSON
hsuser=HOMESEERUSERNAME
hspassword=HOMESEERPASSWORD

http.port=8080

