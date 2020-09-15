![CI](https://github.com/teverett/hsopenapi/workflows/CI/badge.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/92734c5b095c44b48f95bf2d993cddb7)](https://app.codacy.com/manual/teverett/hsopenapi?utm_source=github.com&utm_medium=referral&utm_content=teverett/hsopenapi&utm_campaign=Badge_Grade_Dashboard)

# HomeSeer hsOpenAPI

A Java [OpenAPI](https://en.wikipedia.org/wiki/OpenAPI_Specification) bridge for HomeSeer. 

hsOpenAPI is one of numerous HomeSeer support applications created by khubla.com, including

* [hsClient](https://github.com/teverett/hsclient)
* [hsInflux](https://github.com/teverett/hsinflux)
* [hsMQTT](https://github.com/teverett/hsOpenAPI)
* [hsOpenAPI](https://github.com/teverett/hsOpenAPI)

hsOpenAPI uses [hsClient](https://github.com/teverett/hsclient)

## Usage

Just run the executable jar after compilation. hsOpenAPI will be available on port http/8080 by default.

For example, you can get the device list at:

`http://localhost:8080/homeseer/devices`

## OpenAPI

The OpenAPI spec for hsOpenAPI is [here](https://github.com/teverett/hsOpenAPI/blob/master/src/main/resources/swagger.yaml)

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

