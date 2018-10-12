<?php declare(strict_types=1);

return [
    [
        'name'          => 'Redis-devwh',
        'host'          => '{{swarm_service_ip}}',
        'port'          => "{{redis_ports['devwh']}}",
        'auth'          => null,
        'timeout'       => 2.5,
        'retryInterval' => 100,
        'databaseMap'   => [],
    ],
    [
        'name'          => 'Redis-testwh',
        'host'          => '{{swarm_service_ip}}',
        'port'          => "{{redis_ports['testwh']}}",
        'auth'          => null,
        'timeout'       => 2.5,
        'retryInterval' => 100,
        'databaseMap'   => [],
    ],
    [
        'name'          => 'Redis-preprodwh',
        'host'          => '{{swarm_service_ip}}',
        'port'          => "{{redis_ports['preprodwh']}}",
        'auth'          => null,
        'timeout'       => 2.5,
        'retryInterval' => 100,
        'databaseMap'   => [],
    ],        
];